public class ExtendeClasseAbstrata extends ClasseAbstrata {
    public ExtendeClasseAbstrata(Double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void converte() {
        System.out.println(getValorOriginal() * 2.75);
    }

    @Override
    public Boolean verificaSeVerdadeiro(Boolean test) {
        return  test;
    }


}
