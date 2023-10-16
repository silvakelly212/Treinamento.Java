package cap04.laboratorio;

public class praticando {
    public static void main(String[] args) {
        //crie um codigo que mostre
        int aluno = 21;

        if(aluno >= 60){
            System.out.println("aprovado");
        }else if(aluno <=60 && aluno <=20){
            System.out.println("recuperacao");
        }else{
            System.out.println("reprovado");
        }
        // crie um codigo que recebe 2 numeros e multiplica o num1 pelo num2 atraves de somas repetida
        int num1 = 4;
        int num2 = 50;
        int soma = 0;
        // i quantidade de vezes
        for (int i =0; i < num2; i++){
            System.out.print(num1);
            if(i < num2 -1){
                System.out.print(" + ");
            }
        }
        //implementar um codigo que leia  um numero e realizar a soma dos numeros ente zero  e o numero lido
        int numero = 7;
        int soma2 = 0;
        for (int i =0; i <= numero; i++ ) {
            soma2 += i;
        }


    }

    }
