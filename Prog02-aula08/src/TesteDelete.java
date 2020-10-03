
public class TesteDelete {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto p = new Produto();
		
		p.setCodigo(101);
		
		dao.apaga(p);

	}

}
