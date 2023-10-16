package cap11;

//Tratamento de excecoes
//bloco tray/cath

public class Exemplos {
    public static void main(String[] args) {
        //Exemplo introdução parte 2
        //E a primeira etapa para criar um manipulador de excecoes bloco try/catch
        //catch manipulador da excecao

        int i;
        try {
            i = 1 / 0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i = 2;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
