package projeto.com.impacta.cadastro.service;

import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.repository.PessoaRepositoryImpl;

//contem as regras de negocio
public class PessoaService {
    private final PessoaRepositoryImpl pessoaRepository;

    public PessoaService() {
        pessoaRepository = new PessoaRepositoryImpl();
    }

    //TODO 25/10/2023 Verificar se os dados nao estao nulos: nome e cpf
    public Pessoa salvar(Pessoa pessoa) {
        // se for direrente
        if (pessoa.getNome() != null && pessoa.getCpf() != null) {
            System.out.println("pessoa cdastrada com sucesso");

            pessoaRepository.save(pessoa);

            return pessoa;

        }
        //execao
        throw new PessoaException("nao foi possivel salvar o objeto, " +
                " porque contem dadods nulos: " + "Nome:" + pessoa.getNome() + " cpf " + pessoa.getCpf());

        ///TODO 25/10/2023 Savar no banco de dados
    }

        public Pessoa buscarPorIdPessoa(int idPessoa) {
        return pessoaRepository.findByIdPessoa(idPessoa);

            }

}

