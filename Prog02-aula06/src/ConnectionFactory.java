import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CTRL + SHIFT + O --> (Organizar imports)
public class ConnectionFactory {
	// Padrão criacional
	
	public Connection getConnection() {

		String url = "jdbc:postgresql://localhost:5432/agenda";
		String user = "postgres";
		String pass = "postgres";
		
		try {
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
