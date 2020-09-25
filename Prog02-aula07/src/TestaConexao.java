import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException{
		//JDBC
		
		Connection conexao;
		
		//(String de conexao, usuario, senha)
		conexao = DriverManager.getConnection
					("jdbc:postgresql://localhost:5432/agenda", "postgres", "postgres");
		
		System.out.println("Conectado ao banco de dados");		
		
		//128
		conexao.close();
	}
}
