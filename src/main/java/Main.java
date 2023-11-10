public class Main {

    public static void main(String[] args){
        ExtendeClasseAbstrata extendeClasseAbstrata = new ExtendeClasseAbstrata(100.00);
        System.out.println(extendeClasseAbstrata.getValorOriginal());
        extendeClasseAbstrata.converte();
        System.out.println(extendeClasseAbstrata.verificaSeVerdadeiro(false));
        //
        ClasseImplementaInterface classeImplementaInterface = new ClasseImplementaInterface();
        classeImplementaInterface.metodo1();

    }
}
