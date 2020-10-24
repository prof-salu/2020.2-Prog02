package teste;

import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome");		
		String nome = sc.nextLine();
		
		if(nome.isEmpty()) {
			System.out.println("String vazia");
		}else {
			System.out.println(nome);
		}
	}
}
