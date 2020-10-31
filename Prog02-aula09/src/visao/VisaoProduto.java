package visao;

import java.util.Scanner;

public class VisaoProduto {
	private Scanner sc = new Scanner(System.in);

	public int lerMenu() {
		try {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Cadastrar produto");
			System.out.println("2- Apagar produto");
			System.out.println("3- Alterar produto");
			System.out.println("4- Listar produtos");
			System.out.println("0- Encerrar programa");
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Erro! Opção inválida. Digite novamente");
			return lerMenu();
		}
	}

	public int lerCodigo() {
		try {
			System.out.println("Código do produto: ");
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Erro! Digite um valor inteiro.");
			return lerCodigo();
		}
	}

	public String lerDescricao() {
		System.out.println("Descrição do produto: ");
		String descricao = sc.nextLine();
		if (!descricao.isEmpty()) {
			return descricao;
		} else {
			System.out.println("");
			return lerDescricao();
		}
	}

	public double lerPreco() {
		try {
			System.out.println("Preço do produto: ");
			return Double.parseDouble(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Erro! Digite um valor válido");
			return lerPreco();
		}
	}

	public int lerQuantidade() {
		try {
			System.out.println("Quantidade do produto: ");
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Erro! Digite um valor inteiro");
			return lerQuantidade();
		}
	}

	public void encerrar() {
		sc.close();
		System.out.println("Programa encerrado");
	}
	
	public void limparTela() {
		//Apenas limpa o console do sistema operacional
		//Não limpa o console do eclipse
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
