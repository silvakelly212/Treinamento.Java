package projeto.com.impacta.cadastro.model;

// entidade
//modelo
public class Pessoa {
    private  int idpessoa;
    private String nome;
    private String cpf;

    public Pessoa(int idpessoa, String nome, String cpf) {
        this.idpessoa = idpessoa;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idpessoa=" + idpessoa +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
