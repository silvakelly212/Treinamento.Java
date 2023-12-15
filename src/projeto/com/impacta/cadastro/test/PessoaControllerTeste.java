package projeto.com.impacta.cadastro.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import projeto.com.impacta.cadastro.controller.PessoaController;
import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

public class PessoaControllerTeste {
    private static PessoaController pessoaController;

    @BeforeAll
    static void start () {
        pessoaController = new PessoaController();

    }

    @Test
    void cadastrarPessoa(){

        Pessoa pessoa = new Pessoa("Kely", "78989647");
        System.out.println("criou o objetopessoa:" + pessoa);

        Pessoa pessoaEntity = pessoaController.cadastrar(pessoa);
        System.out.println("Test: executou o metodo salvar" );
    }
    //teste negativo
    @Test
    void cadastrarPessoaNomeOuCpfNuleTeste(){

        Pessoa pessoa = new Pessoa("Kely", "null");
        // vou validar se volta uma excecao
        Assertions.assertThrows(PessoaException.class,
                () -> pessoaController.cadastrar(pessoa));

    }
    @Test
    void  buscarPessoaPeloId(){
        int idPessoa = 22;
        Pessoa pessoaEntity = pessoaController.buscarPorId( idPessoa);

        Assertions.assertNull(pessoaEntity);

    }

}
