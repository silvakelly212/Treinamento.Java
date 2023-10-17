package cap11.laboratorio;

import javax.swing.*;

public class ExercicioIdade {
    private static Object parentComponet;

    //para executar dentro de um bloco de instrucoes precisa de um metodo
    public static void main(String[] args) {

        int ano = 0;
        do {
            System.out.println("Digite o ano do seu Nascimento: ");
            String texto = JOptionPane.showInputDialog("Digite o ano");
            try {
                ano = Integer.parseInt(texto);
                int idade = 2023 - ano;
//                JOptionPane.showInputDialog(parentComponet: null, message:; "Sua idade e: " + idade + "ano");
                System.out.println("Sua idade e: " + idade + "ano");

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println();
            }
            } while (ano == 0);

    }
}