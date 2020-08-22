/**
 * Calculadora de imposto de renda com base em taxas pre definidas
 * @author salu
 * @version 1.0
 *
 */
public class CalculadorDeImposto {

	private double taxa; // renda anual

	private final double RENDA_NIVEL_1 = 10_000.00;
	private final double RENDA_NIVEL_2 = 50_000.00;
	private final double RENDA_NIVEL_3 = 100_000.00;

	private final double IMPOSTO_1 = 0.10; // % do imposto a ser pago
	private final double IMPOSTO_2 = 0.15; // % do imposto a ser pago
	private final double IMPOSTO_3 = 0.20; // % do imposto a ser pago
	private final double IMPOSTO_4 = 0.30; // % do imposto a ser pago

	
	/**
	 * Construtor padrão da classe
	 */
	public CalculadorDeImposto() {
		taxa = 0.0;
	}

	/*
	 * Retorna o valor dos impostos devidos: 
	 * 10% se a renda for inferior a $ 10.000
	 * 15% se a renda for inferior a $ 50.000 
	 * 20% se a renda for inferior a $ 100.000 
	 * 30% caso contrário
	 */

	/**
	 * Retorna o valor dos impostos devidos: 
	 * 10% se a renda for inferior a $ 10.000
	 * 15% se a renda for inferior a $ 50.000 
	 * 20% se a renda for inferior a $ 100.000 
	 * 30% caso contrário
	 * 
	 * @param renda valor referente a renda anual
	 * @return valor do imposto devido
	 */
	public double getTax(double renda) {
		if (renda < RENDA_NIVEL_1) {
			taxa = renda * IMPOSTO_1;
		} else if (renda < RENDA_NIVEL_2) {
			taxa = renda * IMPOSTO_2;
		} else if (renda < RENDA_NIVEL_2) {
			taxa = renda * IMPOSTO_3;
		} else {
			taxa = renda * IMPOSTO_4;
		}
		taxa = Math.round(taxa * 100.0) / 100; // Arredonda para duas casas decimais
		return taxa;
	}
}
