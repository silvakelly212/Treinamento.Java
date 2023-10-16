package cap04;

public class While {
    public static void main(String[] args) {
        // esta no loopjin infinito
        //While ele checa a condicao primeiro eu preciso enteder para depois executar a regar
//        while (true){
//            System.out.println("estou em loopin infinito");
            int numero = 10;
//            while (numero >0){
                //ou primeiro eu vou subtrair
                while (--numero >0){
                System.out.println("o valor do numero e :" + numero);
//                numero = numero - 1;
//                numero = numero - 2;
                //padrao
                //numero--;
            }
                // garanti que realiza a primeira execucao
                do{
                    System.out.println("o valor do numero e :" + numero);
                }while (--numero > 0);

        }


    }

