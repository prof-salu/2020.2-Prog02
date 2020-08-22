/**
 * Classe para teste de produtos
 * @author prof-salu
 *
 */
public class TesteProduto {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Produto p1 = new Produto("Laptop", 3000.0, 10);
		
		System.out.println(p1);
		
//		System.out.println(p1.descricao);
//		System.out.println(p1.getPreco());
//		System.out.println(p1.getQuantidade());
		
		System.out.println(p1.calculaImposto(0.1));

	}

}
