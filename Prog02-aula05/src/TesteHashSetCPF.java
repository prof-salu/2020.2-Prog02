import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("(" + (i) + ") Informe um CPF: ");
			conjunto.add(teclado.nextLine());
		}
		
		teclado.close();
		
		for(String cpf : conjunto) {
			System.out.println(cpf);
		}
	}
}
