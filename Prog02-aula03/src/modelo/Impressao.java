package modelo;

public class Impressao {
	public <T extends Aluno> void imprimeVetor(T[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println();
	}
	
//	public void imprimeVetor(Float[] vetor) {
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
//	}
//	
//	public void imprimeVetor(String[] vetor) {
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
//	}
}
