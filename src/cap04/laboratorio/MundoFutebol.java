package cap04.laboratorio;

public class MundoFutebol {
    public static void main(String[] args) {
        //pulando de 4 em 4 += 4
        for (int ano = 1930; ano <= 2023;  ano += 4 ) {
            if(ano == 1942 || ano ==1946){
                continue;
            }
            System.out.println("Copa do mundo de " + ano );

        }
    }
}