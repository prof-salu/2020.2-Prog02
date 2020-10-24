package Q1;

import java.util.Random;

public class TestaCofrinho {

	public static void main(String[] args) {
		
		Moeda m_01 = new Moeda(0.01);
		Moeda m_05 = new Moeda(0.05);
		Moeda m_10 = new Moeda(0.10);
		Moeda m_25 = new Moeda(0.25);
		Moeda m_50 = new Moeda(0.50);
		Moeda m1 = new Moeda(1.00);
		
		Cofrinho cofre = new Cofrinho();
		Random numero = new Random();
		
		for(int i = 0; i < 300; i++) {			
			switch (numero.nextInt(6)) {
				case 0:
					cofre.adicionarMoeda(m_01);
					break;
				case 1:
					cofre.adicionarMoeda(m_05);
					break;
				case 2:
					cofre.adicionarMoeda(m_10);
					break;
				case 3:
					cofre.adicionarMoeda(m_25);
					break;
				case 4:
					cofre.adicionarMoeda(m_50);
					break;
				case 5:
					cofre.adicionarMoeda(m1);
					break;				
				default:
					break;
			}
		}
		
		System.out.println("Total de R$ 0.01: " + cofre.totalMoedasPorValor(0.01));
		System.out.println("Total de R$ 0.05: " + cofre.totalMoedasPorValor(0.05));
		System.out.println("Total de R$ 0.10: " + cofre.totalMoedasPorValor(0.10));
		System.out.println("Total de R$ 0.25: " + cofre.totalMoedasPorValor(0.25));
		System.out.println("Total de R$ 0.50: " + cofre.totalMoedasPorValor(0.50));
		System.out.println("Total de R$ 1.00: " + cofre.totalMoedasPorValor(1.00));
		
		System.out.println("Total de moedas: " + cofre.quantidadeDeMoedasArmazenadas());
		
		System.out.println("Total deposito: R$ " + cofre.calcularTotalArmazenado());
		
		System.out.println("Menor moeda: " + cofre.menorValor());
		System.out.println("Maior moeda: " + cofre.maiorValor());
		
	}
}
