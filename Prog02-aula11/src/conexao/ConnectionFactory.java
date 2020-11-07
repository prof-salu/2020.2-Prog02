package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		String url = "jdbc:postgresql://localhost:5432/loja";
		String user = "postgres";
		String password = "postgres";// Senha do usuario postgres
		try {
			return DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException();
		}
	}
}
