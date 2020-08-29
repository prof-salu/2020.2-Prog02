package modelo;

public class TestaImpressao {

	public static void main(String[] args) {
		Impressao imp = new Impressao();
		Integer[] v1 = {1,2,3,4,5};
		String[] v2 = {"A", "B", "C", "D"};
		Float[] v3 = {1f, 2f, 3f, 4f, 5.5f};
		
		Aluno a1 = new Aluno("Carlos", 7.5f);
		Aluno a2 = new Aluno("Ana", 6.5f);
		Aluno a3 = new Aluno("Bia", 10f);
		Aluno a4 = new Aluno("Mara", 8f);
		Aluno a5 = new Aluno("João", 6f);
		
		Aluno[] v4 = new Aluno[5];
		v4[0] = a1;
		v4[1] = a2;
		v4[2] = a3;
		v4[3] = a4;
		v4[4] = a5;
		
		Universitario u1 = new Universitario("Carlos", 7.5f);
		Universitario u2 = new Universitario("Ana", 6.5f);
		Universitario u3 = new Universitario("Bia", 10f);
		
		Universitario[] v5 = new Universitario[5];
		v4[0] = u1;
		v4[1] = u2;
		v4[2] = u3;
		
		
//		imp.imprimeVetor(v1);
//		imp.imprimeVetor(v2);
//		imp.imprimeVetor(v3);
		imp.imprimeVetor(v4);
		imp.imprimeVetor(v5);
		
	}

}
