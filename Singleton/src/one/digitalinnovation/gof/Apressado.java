package one.digitalinnovation.gof;

public class Apressado {
    private static Apressado instancia = new Apressado();;

    private Apressado() {
        super();
    }

    public static Apressado getInstacia() {
        return instancia;
    }
}
