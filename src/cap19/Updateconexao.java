package cap19;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updateconexao {
    public static void main(String[] args) {
        String usuario = "pnz43cgh3fd6ljvt";
        String senha = "zxuc06dw43w245hx";
        String url = "jdbc:mysql://lfmerukkeiac5y5w.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/o2bdv17csfky6wxw?useTimezone=true&serverTimezone=UTC";
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url, usuario, senha);
            // index dinamico de acordo com a query
            String query = "insert into pessoa('nome', cpf) VALUE (?, ?);";

        }catch(SQLException e){
            e.printStackTrace();

        }
    }

}
