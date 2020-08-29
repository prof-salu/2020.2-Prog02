package teste;

import modelo.Aluno;
import modelo.DadoGenerico;

public class TestaDadoGenerico {

	public static void main(String[] args) {
		DadoGenerico<String> d1 = new DadoGenerico<String>("Salu");
		DadoGenerico<Integer> d2 = new DadoGenerico<Integer>(12);
		DadoGenerico<Float> d3 = new DadoGenerico(4.5f);
		DadoGenerico<Aluno> d4 = new DadoGenerico(new Aluno("Bia", 7f));
	}

}
