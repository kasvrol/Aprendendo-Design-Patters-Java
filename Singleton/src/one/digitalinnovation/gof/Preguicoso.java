package one.digitalinnovation.gof;

public class Preguicoso {
    private static Preguicoso instancia;

    private Preguicoso() {
        super();
    }

    public static Preguicoso getInstancia() {
        if (instancia == null) {
            instancia = new Preguicoso();
        }

        return instancia;
    }
}
