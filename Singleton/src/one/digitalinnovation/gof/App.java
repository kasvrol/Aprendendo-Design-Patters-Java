package one.digitalinnovation.gof;

public class App {
    public static void main(String[] args) {
        Preguicoso demorado = Preguicoso.getInstancia();
        System.out.println(demorado);
        demorado = Preguicoso.getInstancia();
        System.out.println(demorado);

        Apressado rapido = Apressado.getInstancia();
        System.out.println(rapido);
        rapido = Apressado.getInstancia();
        System.out.println(rapido);

        EncapsulamentoSingleton encapsulado = EncapsulamentoSingleton.getInstancia();
        System.out.println(encapsulado);
        encapsulado = EncapsulamentoSingleton.getInstancia();
        System.out.println(encapsulado);
    }
}
