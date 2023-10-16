package cap09.laboratorio;
// public final class Pessoa nao tem  heranca
public abstract class Pessoa {
    protected String nome; // super Classe tem acesso ao atributo
    private int idade;//nao tem acesso nas superClasses Filhp/Filha
    private char sexo;
    private String cpf;
    //composicao
    private String nacioanlidae;
    private String naturalidade;
//    private Tipo tipo;
    private Rg rg;

    public Pessoa() {

    }

    // Construtor
    public Pessoa(String nome, int idade, char sexo, Rg rg) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = rg;

    }
    public abstract void falar(String fala);
}



