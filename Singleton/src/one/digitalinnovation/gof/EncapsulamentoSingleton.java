package one.digitalinnovation.gof;

public class EncapsulamentoSingleton {
    private static class Capsula {
        public static EncapsulamentoSingleton instancia = new EncapsulamentoSingleton();

    }

    private EncapsulamentoSingleton() {
        super();
    }

    public static EncapsulamentoSingleton getInstancia() {
        return Capsula.instancia;
    }
}
