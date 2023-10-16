package cap03.laboratorio;

public class EstruturaBasica {

    public static void main(String[] args){

        int valor = 10;
        // porcentagem pega o resto da divisao
        String resultado = valor % 2 ==0 ? "PAR" : "IMPAR";
        System.out.println(resultado);

        // poderia fazer a exibicao direta
        System.out.println(valor % 2 ==0 ? "PAR" : "IMPAR");

    }
}
