package exe2;

public class TestaCalculadora {
    public static void main(String[] args) {
        System.out.println(Calculadora.somar(2, 2));
        System.out.println(Calculadora.subtrair(2, 2));
        System.out.println(Calculadora.multiplicar(2, 2));
        System.out.println(Calculadora.dividir(2, 0));
        System.out.println(Calculadora.elevar(2, 2));
        System.out.println(Calculadora.fatorial(5));
        System.out.println(Calculadora.fatorial(3));
    }
}
