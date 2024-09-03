package exe1;

public class Contador {
    private static int vezesInstanciado;

    public Contador() {
        incrementar();
    }

    public static int getVezesInstanciado(){
        return vezesInstanciado;
    }

    public static void zerar(){
        vezesInstanciado = 0;
    }

    public static void incrementar(){
        vezesInstanciado++;
    }
}
