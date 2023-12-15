package projeto.com.impacta.cadastro.controller;

import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.service.PessoaService;

public class PessoaController {

    private PessoaService pessoaService;
    public PessoaController(){

        pessoaService = new PessoaService();
    }
    public Pessoa cadastrar(Pessoa pessoa) {
         return pessoaService.salvar(pessoa);
    }
    public Pessoa buscarPorId(int idPessoa){
        return pessoaService.buscarPorIdPessoa(idPessoa);
    }


}
