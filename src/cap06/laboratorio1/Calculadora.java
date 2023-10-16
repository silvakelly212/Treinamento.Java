package cap06.laboratorio1;

public class Calculadora {

    // Método para subtrair dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    //sobre carga ela tem o mesmo nome mas tem assinatura diferente
    // Método para subtrair dois números de ponto flutuante
    public double subtrair(double a, double b) {
    //    public long subtrair(double a, double b) {
    //    return (long)(a -b);
        return a - b;
    }

    // Método para multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números
    public int dividir(int a, int b) {
        return a / b;


    }

    }



