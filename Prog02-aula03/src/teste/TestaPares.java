package teste;

import modelo.Aluno;
import modelo.Par;
import modelo.Produto;

public class TestaPares {

	public static void main(String[] args) {
		Par<Integer, String> p1 = new Par(12, "A");
		Par<String, String> p2 = new Par("X", "Y");
		Par<Float, Boolean> p3 = new Par(34.5f, true);
		Par<Aluno, Produto> p4 = new Par(new Aluno("Jose", 6), 
										 new Produto<Integer, Float>(1, "Borracha", 23.5f));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
