package exercicios;

public class ExercicioSlide01 {
	
	// VETOR ==> [A, B, C, D, E]  ==> (0, 3) ==> [C, B, A, D, E]

	//Escreva um método genérico para trocar as posições de dois elementos diferentes em um vetor.
	public <T> void trocaPosicoes(T[] vetor, int posAtual, int posNova) {
		T valorTemp = vetor[posNova];
		
		vetor[posNova] = vetor[posAtual];
		vetor[posAtual] = valorTemp;
	}
	
	
	//Escreva um método genérico capaz de identificar o maior e o menor elemento de um vetor. 
	//(DICA: Utilize a interface Comparable)

	public <T extends Comparable> void buscaElemento(T[] vetor) {
		T maior = vetor[0];
		T menor = vetor[0];
		
		for(int i = 0; i < vetor.length; i++) {
			if(maior.compareTo(vetor[i]) < 0) {
				maior = vetor[i];
			}
			
			if(menor.compareTo(vetor[i]) > 0) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
	} 
}
