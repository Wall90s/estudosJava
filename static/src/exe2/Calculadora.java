package exe2;

public abstract class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return (b == 0) ? 0 : a / b;
    }

    public static double elevar(double a, double b) {
        return Math.pow(a, b);
    }

    public static int fatorial(int a) {
        int resultado = 1;
        for (int i = a; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
