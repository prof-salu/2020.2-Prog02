package teste;

import modelo.Aluno;
import modelo.Dado;

public class TestaDado {
	public static void main(String[] args) {
		Dado d1 = new Dado("Azul");
		//Erro --> Dado d2 = new Dado(33);
		Aluno a1 = new Aluno("Salu", 33);
		//Erro --> Dado d3 = new Dado(a1);
		
	}
}
