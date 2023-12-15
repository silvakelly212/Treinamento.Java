package projeto.com.impacta.cadastro.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import projeto.com.impacta.cadastro.model.Pessoa;
import projeto.com.impacta.cadastro.service.PessoaService;

import java.net.URL;
import java.util.ResourceBundle;


import java.net.URL;
import java.util.ResourceBundle;

public class PessoaController implements Initializable {

    @FXML
    private Button enviar;

    @FXML
    private Button alterar;

    @FXML
    private Button excluir;

    @FXML
    private TableColumn<Pessoa, String> columNome;

    @FXML
    private TableColumn<Pessoa, String> colunumCpf;

    @FXML
    private TableColumn<Pessoa, String> coluncIdPessoa;

    private TableView<Pessoa> table;

    private TextField inputNome;

    private TextField inputCpf;

    PessoaService pessoaService;
    int indexTabela;
    int idPessoa;

    void adicionar(ActionEvent event) {

        String nome = inputNome.getText();
        String cpf = inputCpf.getText();

        Pessoa pessoa = new Pessoa(nome, cpf);
        Pessoa pessoaEntity = pessoaService.salvar(pessoa);

        Alert alert;
        if (pessoaEntity != null) {
            atualizartabela();
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastro");
            alert.setHeaderText("Cadastro ok");
            alert.setContentText("cadastrado com sucesso");
            alert.showAndWait();
        } else {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cadastro");
            alert.setHeaderText("Cadastro nok");
            alert.setContentText("cadastrado não realizado");
            alert.showAndWait();
        }
    }

    @FXML
    void alterar(ActionEvent event) {
        String nome = inputNome.getText();
        String cpf = inputCpf.getText();

        Pessoa pessoa = new Pessoa(idPessoa, nome, cpf);
        Pessoa pessoaEntity = pessoaService.atualizar(pessoa);

        Alert alert;
        if (pessoaEntity != null) {
            atualizartabela();
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alteração");
            alert.setHeaderText("Alteração ok");
            alert.setContentText("Alterado com sucesso");
            alert.showAndWait();
        } else {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alteração");
            alert.setHeaderText("Alteração nok");
            alert.setContentText("Alterado falhou");
            alert.showAndWait();
        }


        @FXML
        void excluir (ActionEvent event){
            System.out.println("excluindo");
        }

        void atualizartabela () {
            try {
                ObservableList<Pessoa> pessoas = FXCollections.observableArrayList();
                pessoas.addAll(pessoaService.buscarTodos());

                table.setItems(pessoas);

                columnIdPessoa.setCellValueFactory(pessoa -> {
                    return new SimpleStringProperty(String.valueOf(pessoa.getValue().getIdPessoa()));
                });

                columnNome.setCellValueFactory(pessoa -> {
                    return new SimpleStringProperty(pessoa.getValue().getNome());
                });

                columnCpf.setCellValueFactory(pessoa -> {
                    return new SimpleStringProperty(pessoa.getValue().getCpf());
                });

            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        void linhaSelecionadaTabela () {
            table.setRowFactory(pessoaTableView -> {
                TableRow<Pessoa> linha = new TableRow<>();
                linha.setOnMouseClicked(mouseEvent -> {
                    if (mouseEvent.getClickCount() == 1 && !linha.isEmpty()) {

                        indexTabela = table.getSelectionModel().getSelectedIndex();

                        idPessoa = table.getItems().get(indexTabela).getIdPessoa();

                        String nome = table.getItems().get(indexTabela).getNome();
                        inputNome.setText(nome);

                        String cpf = table.getItems().get(indexTabela).getCpf();
                        inputNome.setText(cpf);

                        System.out.printf(idPessoa + nome + cpf);
                    }
                });
                return linha;
            });
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pessoaService = new PessoaService();
        atualizartabela();
    }

}
