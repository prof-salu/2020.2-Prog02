package teste;

import modelo.Produto;

public class TestaProduto {

	public static void main(String[] args) {
		Produto<String, String> p1 = new Produto("ABC1", "Caneta", "2");
		Produto<Integer, Float> p2 = new Produto(23, "Caderno", 7f);

	}

}
