package projeto.com.impacta.cadastro.repository;

import projeto.com.impacta.cadastro.exception.PessoaException;
import projeto.com.impacta.cadastro.model.Pessoa;

import java.sql.*;
import java.util.List;

public class PessoaRepositoryImpl implements PessoaRepository {

 @Override
public Pessoa save(Pessoa pessoa) {


   String query = "INSERT INTO impacta.pessoa (nome, cpf) VALUES (? ,?);";

   try (Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

    preparedStatement.setString(1, pessoa.getNome());
    preparedStatement.setString(2, pessoa.getCpf());

    if (preparedStatement.executeUpdate() > 0) {
     System.out.println("salvo com sucesso...");
     ResultSet primaryKeys = preparedStatement.getGeneratedKeys();
     if (primaryKeys.next()){
      int idPessoa = primaryKeys.getInt( 1);
      return new Pessoa(idPessoa, pessoa.getNome(), pessoa.getCpf());

     }
         return pessoa;
    }
    throw new PessoaException("Não foi possivel salvar objeto: " + pessoa);
   } catch (SQLException | PessoaException e) {
    e.printStackTrace();
   }

   return null;
  }

  @Override
  public Pessoa findByIdPessoa(int idPessoa) {

     String query = "select * from pessoa where idPessoa =?";

     try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

         preparedStatement.setInt( 1, idPessoa);

         ResultSet resultSet = preparedStatement.executeQuery();

         if(resultSet.next()){
             int primaryKey = resultSet.getInt("idpessoa");
             String nome = resultSet.getString("nome");
             String cpf = resultSet.getString("cpf");

             return  new Pessoa(primaryKey, nome, cpf);

         }

     }catch (SQLException e){
         e.printStackTrace();
     }



   return null;
  }

  @Override
  public Pessoa findByCpf(String cpf) {
   return null;
  }

  @Override
  public List<Pessoa> findByNome(String nome) {
   return null;
  }


  // TODO: 25/10/2023 extrair para uma classe abstrata essa conexao
  private Connection getConnection() throws SQLException {
   String usuario = "root";
   String senha = "123456";
   String urlConexao = "jdbc:mysql://localhost:3306/impacta?useTimezone=true&serverTimezone=UTC";

   return DriverManager.getConnection(urlConexao, usuario, senha);
  }
 }





