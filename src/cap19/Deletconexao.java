package cap19;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletconexao {
    public static void main(String[] args) {
        String usuario = "pnz43cgh3fd6ljvt";
        String senha = "zxuc06dw43w245hx";
        String url = "jdbc:mysql://lfmerukkeiac5y5w.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/o2bdv17csfky6wxw?useTimezone=true&serverTimezone=UTC";
        Connection connection = null;

        try {
            connection =DriverManager.getConnection(url, usuario, senha);
            String query = "delte from pessoa" +
                   "where pessoa = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,  3);
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("cpf cancelado com sucesso");
            }else{
                System.out.println("nao foi possivel ecluir lina" + 3);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();
                    System.out.println("conexao fechada com sucesso");
                }catch (SQLException e){
                    System.out.println("falha ao fechar conexao");
                    e.printStackTrace();
                }
            }
        }

    }

}
