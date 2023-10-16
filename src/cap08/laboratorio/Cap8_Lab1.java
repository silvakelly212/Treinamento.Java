package cap08.laboratorio;

public class Cap8_Lab1 {

    public static int maiorNumero (int[] numero){
        int maiorNumero =0;
        for (int item : numero){
            if (item >= maiorNumero){
                maiorNumero = item;
            }
        }
        return maiorNumero;
    }
}
