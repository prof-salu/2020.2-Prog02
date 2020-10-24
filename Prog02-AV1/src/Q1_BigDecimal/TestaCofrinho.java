package Q1_BigDecimal;

import java.util.Random;

public class TestaCofrinho {

	public static void main(String[] args) {
		
		Moeda m_01 = new Moeda(ValorMoeda.UM_CENTAVO);
		Moeda m_05 = new Moeda(ValorMoeda.CINCO_CENTAVOS);
		Moeda m_10 = new Moeda(ValorMoeda.DEZ_CENTAVOS);
		Moeda m_25 = new Moeda(ValorMoeda.VINTE_E_CINCO_CENTAVOS);
		Moeda m_50 = new Moeda(ValorMoeda.CINQUENTA_CENTAVOS);
		Moeda m1 = new Moeda(ValorMoeda.UM_REAL);
		
		Cofrinho cofre = new Cofrinho();
		Random numero = new Random();
		
		for(int i = 0; i < 10000; i++) {			
			switch (numero.nextInt(ValorMoeda.values().length)) {
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
		
		System.out.println("Total de R$ 0.01: " + cofre.totalMoedasPorValor(ValorMoeda.UM_CENTAVO));
		System.out.println("Total de R$ 0.05: " + cofre.totalMoedasPorValor(ValorMoeda.CINCO_CENTAVOS));
		System.out.println("Total de R$ 0.10: " + cofre.totalMoedasPorValor(ValorMoeda.DEZ_CENTAVOS));
		System.out.println("Total de R$ 0.25: " + cofre.totalMoedasPorValor(ValorMoeda.VINTE_E_CINCO_CENTAVOS));
		System.out.println("Total de R$ 0.50: " + cofre.totalMoedasPorValor(ValorMoeda.CINQUENTA_CENTAVOS));
		System.out.println("Total de R$ 1.00: " + cofre.totalMoedasPorValor(ValorMoeda.UM_REAL));
		System.out.println();	
		System.out.println("Total de moedas: " + cofre.quantidadeDeMoedasArmazenadas());
		System.out.println();
		System.out.println("Total deposito: R$ " + cofre.calcularTotalArmazenado());
		System.out.println();
		System.out.println("Menor moeda: " + cofre.menorValor());
		System.out.println("Maior moeda: " + cofre.maiorValor());
		
	}
}
