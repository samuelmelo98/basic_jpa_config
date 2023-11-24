package util;


import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataUtil implements java.io.Serializable {
    /**
     * Operações com data java 8+
     */

    /**
     * Data local
     * @return
     */
    public static LocalDate getDataAtual(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    /**
     * Instancia uma data passando uma string, e um formato
     * Ex:2022-07-20
     * Ex: formato "dd/MM/yyyy"
     * @param date  yyyy-MM-dd
     * @param formato  dd/MM/yyyy
     * @return uma string  data no formato padrão ou no formato passado por parametro.
     */
    public static String getDataFormatada(String date, String formato){
        /**
         * Instancia uma data com a string passada.
         */
        LocalDate localDate = LocalDate.parse(date);
        try{
            if(formato != null){
                /**
                 * Instancia um objeto para formatar a data instanciada, com o novo formato.
                 */
                DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern(formato);
                return dateTimeFormatter.format(localDate);
            }

        } catch (RuntimeException e){

        }
        return localDate.toString();
    }



    /**
     * DataHora Local
     * @return
     */
    public static LocalDateTime getDataHoraAtual(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    /**
     * Instancia uma dataHora passada via parametro
     * Ex:2023-07-20T01:30:26
     * Ex:"dd/MM/yyyy HH:mm" formato ISO
     * @param dateHora
     * @param formato
     * @return
     */
    public static LocalDateTime getDataHoraFormatada(String dateHora, String formato){
        LocalDateTime localDateTime = LocalDateTime.parse(dateHora, DateTimeFormatter.ofPattern(formato));
        return localDateTime;
    }

    /**Instancia DataHora no formato GMT
     * Ex:2023-07-20T01:30:26Z
     * @param dateHoraFormat
     * @return
     */
    public static Instant getDataHoraFormatadaGMT(String dateHoraFormat){
        Instant localDateTime = Instant.parse(dateHoraFormat);
        return localDateTime;
    }

    /**
     * Data hora Global GMT, Zulu, UTC. Horário de Londres
     * @return
     */
    public static Instant getDataHoraAtualInstant(){
        Instant localDateTime = Instant.now();
        return localDateTime;
    }

    /**
     * Instancia DateHora no GMT zulu, passando fusio - horário
     * Ex:2022-07-20T01:30:00-03:00
     */
    public static Instant getDataHoraFormatdaGMT(String format){
        Instant instant = Instant.parse(format);
        return instant;
    }

    /**
     * Instancia uma data com parametros inteiros.
     * @param ano
     * @param mes
     * @param dia
     * @return
     */
    public static LocalDate getDatePorParametro(Integer ano, Integer mes, Integer dia){
        LocalDate localDate = LocalDate.of(ano, mes, dia);
        return  localDate;

    }

    /**
     * Instancia uma data hora com parametros inteiros.
     * @param  ano
     * @param  mes
     * @param  dia
     *  @param hora
     *  @param minuto
     *  @param segundo
     * @return
     */
    public static LocalDateTime getDateHoraPorParametro(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo){
        LocalDateTime localDateTime = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
        return  localDateTime;

    }

    /**
     *
     *
     */
    public static String getDataAtualFormatoBrasil(){
        try {
            LocalDate localDate = LocalDate.now();
            return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (RuntimeException e ){
            e.printStackTrace();
        }
        return null;
    }

    public static String dataInstantGMT(){
        Instant instant = Instant.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        dateTimeFormatter.format(instant);
        return dateTimeFormatter.format(instant);
    }

    public static  String getTesteInstant(){
        Instant instant = Instant.now();
        Instant instant1 = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate localDate = LocalDate.now(ZoneId.of("Portugal"));
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant,ZoneId.systemDefault());
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant,ZoneId.of("America/Sao_Paulo"));
        for (String s:ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        return null;
    }
    /**
     * Calculos duraçao entre duas datas com LocalDate
     * @param dataInicio not null, data inicio 2023-01-01
     * @param dataFim not null,  data fim 2023-02-01
     *  retorna a duração em dias.
     */
public static String duracaoDatas(LocalDate dataInicio, LocalDate dataFim){
    if(dataInicio != null && dataFim != null){
       Duration duration = Duration.between(dataInicio.atStartOfDay(),dataFim.atStartOfDay());
       return duration.toString();
    }
    return  null;
}

/**
 * Instanciando Datas com a classe Date e formatando com a classe SimpleDateFormat
 *Curiosidade -> O Java armazena uma data em millisegundos desde 1º de Janeiro de 1970 GMT(UTC)
 * 1s = 1000
 * 1000L * 60L  = 1minuto * 60L = 1hora * 5L = 5horas
 * Date inicioDataJava = new Date(1000L * 60L * 60L * 3L);
 *                                 mm     ss    mm     h
 */
public static String getDataComDate(String formato){
    Date obj = new Date(1000L * 60L * 60L * 3L);
    Date obj2 = new Date(0L);
    System.out.println(obj);
    Date date = new Date(System.currentTimeMillis());
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    if(formato.equals("dd/MM/yyyy")){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }
    return simpleDateFormat2.format(date);

}
}
