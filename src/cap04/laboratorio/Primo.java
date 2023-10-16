package cap04.laboratorio;

public class Primo {
    public static void main(String[] args) {
        // verificar um numero primo

        int numero = 25;

        if (numero == 0 || numero ==1) {
        System.out.println("não e numero primo");
        }
        int looping = 2;
        int contador = 0;

        //verificar atraves do contador
        // se o resto da divisao for zero o numero e primo
        // loopin expressao divisores
        while(looping <= numero){
            if(numero % looping ==0){
            contador++;
            }
            looping++;
        }
        if(contador ==2){
            System.out.println("e numero primo");
        }else{
            System.out.println("não e numero primo");
        }


    }
}
