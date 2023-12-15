package cap19;


import java.sql.*;

public class Testeconexao {
    public static void main(String[] args) {
        String usuario = "pnz43cgh3fd6ljvt";
        String senha = "zxuc06dw43w245hx";
        String url = "jdbc:mysql://lfmerukkeiac5y5w.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/o2bdv17csfky6wxw?useTimezone=true&serverTimezone=UTC";
        try{
            Connection connection = DriverManager.getConnection(url, usuario, senha);
            // forma de consulta
            Statement statement = connection.createStatement();
            String query = "select * from pessoa";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int idpessoa = resultSet.getInt( "idpessoa");
                String nome = resultSet.getString( "nome");
                String cpf =resultSet.getString( "cpf");
                System.out.println("idpessoa: " +idpessoa +"nome: "+ nome + "cpf:"+ cpf);

            }
            System.out.println();

        }catch(SQLException e){
            e.printStackTrace();

        }
    }

}
