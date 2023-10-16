package cap04;

public class For {
    public static void main(String[] args) {
        // vantagem do for
//        for ( int numero = 10; numero > 0; numero --){

//        }
        //multiplicando por dois
            for ( int numero = 10; numero < 100; numero *= 2){
            if(numero > 40){
                break;
            }
                System.out.println("o valor do numero e :" + numero);
        }
            // usamos for int para lista for de fora percorre coluna e for dentro executa linha
//            for (int i=5; i <=10; i++){
//                System.out.println(i);
//            }

    }
}
