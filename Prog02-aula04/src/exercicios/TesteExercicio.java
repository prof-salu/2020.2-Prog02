package exercicios;

public class TesteExercicio {
	
	//NETBEANS ==> psvm + tab ==> public static void main(String[] args) {}
	//NETBEANS ==> sout + tab ==> System.out.println(); 
	
	public static void main(String[] args) {
		ExercicioSlide01 ex01 = new ExercicioSlide01();
		
		String nomes[] = {"Ana", "Mauro", "Pedro", "Jose", "Carlos"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		
		//Antes da troca
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		ex01.trocaPosicoes(numeros, 1, 4);
		System.out.println();
		
		//Depois da troca
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		ex01.buscaElemento(nomes);
		ex01.buscaElemento(numeros);
	}
}
