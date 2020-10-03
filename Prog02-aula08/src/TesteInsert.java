public class TesteInsert {

	public static void main(String[] args) {
		Produto p1 = new Produto(105, "Caneca barro", 500, 8.80);
		Produto p2 = new Produto(106, "Caneca aluminio", 635, 9.90);
		Produto p3 = new Produto(107, "Caneca decorativa", 400, 18.80);
		Produto p4 = new Produto(108, "A Caneca de prata", 770, 38.80);
		ProdutoDAO dao = new ProdutoDAO();
		
		//dao.adiciona(p1);
		//dao.adiciona(p2);
		dao.adiciona(p4);
		
	}

}
