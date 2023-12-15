package projeto.com.impacta.cadastro.repository;

import projeto.com.impacta.cadastro.model.Pessoa;
import java.util.List;

public interface PessoaRepository {
    //Create
    Pessoa save (Pessoa pessoa);
    //Read
    Pessoa findByIdPessoa(int idPessoa);
    Pessoa findByCpf(String cpf);
    List<Pessoa> findByNome(String nome);

}
