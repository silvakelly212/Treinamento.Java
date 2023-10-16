package cap09;
// extends ele pega herda os dados da classe pessoa

public class Funcionario extends Pessoa{
    private String matricula;
    private String salario;


public String getMatricula(){return matricula;}

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //super somente quando estiver protected
    public void imprimir(){
    System.out.println("nome: " + super.getNome());

    }
}

