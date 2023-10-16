package cap06.laboratorio1;

public class TestandoCalculadora {
    // estrutura basica do metodo

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.somar(20, 20);
        System.out.println(resultadoSoma);

        //Alternativa de execucao
        System.out.println("calculadora.soma(20, 20) = "+ calculadora.somar(20, 20));


        int resultadoSubtrair = calculadora.subtrair(30, 20);
        System.out.println(resultadoSubtrair);

        int resultadoMultipicar = calculadora.multiplicar(10, 20);
        System.out.println(resultadoMultipicar);

        int resultadoDividir = calculadora.dividir(10, 20);
        System.out.println(resultadoDividir);


        System.out.println("calculadora.subtrair(20.5, 10.5) = " + calculadora.subtrair(20.5, 10.5));





    }


}
