import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListasXConjuntos {

	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<>();
		//Collection<Integer> lista = new HashSet<>();
		
		int total = 100000;
		
		long inicio = System.currentTimeMillis();
		
		//System.out.println(inicio);
		for(int i = 1; i <+ total; i++) {
			lista.add(i);
		}
		
		for(int i = 1; i <+ total; i++) {
			lista.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		
		long intervalo = fim - inicio;
		
		System.out.println("Tempo gasto: " + intervalo);
		
		//arraylist ==> 265
		//hashset ==> 8
		
		//arraylist ==> 4
		//hashset ==> 2
	}

}
