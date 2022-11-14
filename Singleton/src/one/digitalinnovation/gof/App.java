package one.digitalinnovation.gof;

public class App {
    public static void main(String[] args) {
        Preguicoso demorado = Preguicoso.getInstacia();
        System.out.println(demorado);
        demorado = Preguicoso.getInstacia();
        System.out.println(demorado);

        Apressado rapido = Apressado.getInstacia();
        System.out.println(rapido);
        rapido = Apressado.getInstacia();
        System.out.println(rapido);

        EncapsulamentoSingleton encapsulado = EncapsulamentoSingleton.getInstancia();
        System.out.println(encapsulado);
        encapsulado = EncapsulamentoSingleton.getInstancia();
        System.out.println(encapsulado);
    }
}
