import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
	//DAO ==> DATA ACESS OBJECT

	private Connection con;

	public ContatoDAO() {
		this.con = new ConnectionFactory().getConnection();
	}

	// CRUD

	// SQL injection

	// ******NUNCA FAZER ISSO*******
//	String sql = "insert into contato values (" + contato.getId() + ", " 
//												+ contato.getNome() + ","  
//												+ contato.getEmail() + ", "
//												+ contato.getEndereco() + ","
//												+ contato.getDataDeNascimento()	+ ")";	
	// ******NUNCA FAZER ISSO*******

	public void adiciona(Contato contato) {

		String sql = "insert into contato values(?,?,?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, contato.getId());
			stmt.setString(2, contato.getNome());
			stmt.setString(3, contato.getEmail());
			stmt.setString(4, contato.getEndereco());
			stmt.setObject(5, contato.getDataDeNascimento());

			stmt.execute();
			stmt.close();
			con.close();

			System.out.println("Contato gravado com sucesso!");

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	//Consulta
	public List<Contato> getLista() {
		List<Contato> lista = new ArrayList<>();
		String sql = "select * from contato";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Contato contato = new Contato();

				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				contato.setDataDeNascimento(rs.getObject("dataNascimento", LocalDate.class));

				lista.add(contato);
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

		return lista;
	}

	public void atualiza(Contato contato) {
		String sql = "update contato set nome=?, email=?, endereco=?, datanascimento=? "
					+ "where id = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setObject(4, contato.getDataDeNascimento());
			stmt.setInt(5, contato.getId());
			
			stmt.execute();
			stmt.close();
			con.close();
			
			System.out.println("Contato atualizado");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

	public void apaga(Contato contato) {
		String sql = "delete from contato where id = ?;";
		//String sql = "delete from contato where id = " + contato.getId();
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			//stmt.setInt(1, contato.getId());
			
			stmt.execute();
			stmt.close();
			con.close();
			
			System.out.println("Contato apagado!");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}

