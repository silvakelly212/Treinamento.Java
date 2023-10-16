package cap05.Exemplo;

import cap05.Carro;

public class Garagem {

    public Carro carroPasseio;
    public Carro carroUltilitario;

    // nos argumentos em String eu passo o tipo e nome
    //args recebe uma lista
    public static void main(String[] args) {

        Garagem g = new Garagem();
        g.carroPasseio = new Carro();

        g.carroPasseio.modelo = "omega";
        g.carroPasseio.cor = "vermelho";
        g.carroPasseio.potencialDoMotor = 1.4;

        System.out.println(g.carroPasseio.modelo);
        System.out.println(g.carroPasseio.cor);
        System.out.println(g.carroPasseio.potencialDoMotor);

        g.carroUltilitario = new Carro();
        g.carroUltilitario.modelo = "onix";
        g.carroUltilitario.cor = "Azul";
        g.carroUltilitario.potencialDoMotor = 1.4;

        System.out.println(g.carroUltilitario.modelo);
        System.out.println(g.carroUltilitario.cor);
        System.out.println(g.carroUltilitario.potencialDoMotor);
    }
}


