import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteArrayListNumero {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("(" + (i) + ") Informe um numero: ");
			lista.add(teclado.nextInt());
		}

		teclado.close();

		System.out.println("Lista NAO ORDENADA");

		for (Integer numero : lista) {
			System.out.print(numero + " ");
		}
		
		Collections.sort(lista);
		
		System.out.println();
		System.out.println("Lista ORDENADA");

		for (Integer numero : lista) {
			System.out.print(numero + " ");
		}

	}

}
