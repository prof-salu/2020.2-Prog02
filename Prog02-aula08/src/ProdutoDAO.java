import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
	private Connection con;
	
	public ProdutoDAO() {
		con = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Produto produto) {
		String sql = "INSERT INTO produtos VALUES (?,?,?,?);";
				
		//TRY WITH RESOURCES fecha automaticamente apos o encerramento do bloco try.
		//A classe declarada no try, deve implementar a interface AutoCloseable. (FUNCIONA A PARTIR DO JAVA 7)	
		try (PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setInt(1, produto.getCodigo());
			stmt.setString(2, produto.getDescricao());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setDouble(4, produto.getPreco());
			
			stmt.execute();
			
			System.out.println("Produto gravado!");
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			System.out.println("Fim da gravação!");
		}
	}
	
	public void altera(Produto produto) {
		String sql = "UPDATE produtos SET descricao=?, quantidade=?, preco=? WHERE codigo=?;";
		
		//TRY WITH RESOURCES fecha automaticamente apos o encerramento do bloco try.
		//A classe declarada no try, deve implementar a interface AutoCloseable. (FUNCIONA A PARTIR DO JAVA 7)
		try(PreparedStatement stmt = con.prepareStatement(sql);){
			stmt.setString(1, produto.getDescricao());
			stmt.setInt(2, produto.getQuantidade());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getCodigo());
			
			stmt.execute();
			
			System.out.println("Produto alterado!");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void apaga(Produto produto) {
		String sql = "DELETE FROM produtos WHERE codigo=?;";
		//TRY WITH RESOURCES fecha automaticamente apos o encerramento do bloco try.
		//A classe declarada no try, deve implementar a interface AutoCloseable. (FUNCIONA A PARTIR DO JAVA 7)
		try(PreparedStatement stmt = con.prepareStatement(sql);){
			
			stmt.setInt(1, produto.getCodigo());
			stmt.execute();
			System.out.println("Produto apagado!");
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	//ORGANIZE IMPORTS ==> (CTRL + SHIFT + O)
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM produtos";
		
		//TRY WITH RESOURCES fecha automaticamente apos o encerramento do bloco try.
		//A classe declarada no try, deve implementar a interface AutoCloseable. (FUNCIONA A PARTIR DO JAVA 7)
		try(PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();){
						
			while(rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setDescricao(rs.getString("descricao"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setPreco(rs.getDouble("preco"));
				
				produtos.add(p);
			}			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return produtos;
	}
	
	//Retornar produtos baseado na descricao
	public List<Produto> getProdutos(String descricao){
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM produtos WHERE LOWER(descricao) LIKE ?";
		String filtro = "%" + descricao + "%";
		
		//TRY WITH RESOURCES fecha automaticamente apos o encerramento do bloco try.
		//A classe declarada no try, deve implementar a interface AutoCloseable. (FUNCIONA A PARTIR DO JAVA 7)
		try(PreparedStatement stmt = con.prepareStatement(sql);
			){
			
			stmt.setString(1, filtro);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setDescricao(rs.getString("descricao"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setPreco(rs.getDouble("preco"));
				
				produtos.add(p);
			}
			
			rs.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return produtos;
	}
}
