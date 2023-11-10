


/*
Exeplo de uma classe abstrata, para entender os fundamentos básicos!
 */
public abstract class ClasseAbstrata {

    private Double valorOriginal, valorConvertido;

    public ClasseAbstrata(Double valorOriginal) {
        this.valorOriginal = valorOriginal;

    }

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public Double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(Double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    /**
     * Método abstrato, que é obrigado as classes que herdão essa classe implementar.
     */
    public abstract void converte();

    public abstract Boolean verificaSeVerdadeiro(Boolean test);




}
