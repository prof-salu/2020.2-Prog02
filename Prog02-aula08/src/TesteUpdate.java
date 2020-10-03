
public class TesteUpdate {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto p = new Produto(104, "Porta retrato", 700, 7.80);
		
		dao.altera(p);

	}

}
