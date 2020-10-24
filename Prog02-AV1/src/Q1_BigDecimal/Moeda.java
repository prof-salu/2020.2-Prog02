package Q1_BigDecimal;

import java.math.BigDecimal;

public class Moeda implements Comparable<Moeda> {
	private ValorMoeda nome;
	private BigDecimal valor;

	public Moeda(ValorMoeda tipo) {
		this.nome = tipo;
		defineValorPorNome();
	}	
	
	public ValorMoeda getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	private void defineValorPorNome() {
		switch (nome) {
			case UM_CENTAVO:
				valor = new BigDecimal("0.01");
				break;
			case CINCO_CENTAVOS:
				valor = new BigDecimal("0.05");
				break;
			case DEZ_CENTAVOS:
				valor = new BigDecimal("0.10");
				break;
			case VINTE_E_CINCO_CENTAVOS:
				valor = new BigDecimal("0.25");
				break;
			case CINQUENTA_CENTAVOS:
				valor = new BigDecimal("0.50");
				break;
			case UM_REAL:
				valor = new BigDecimal("1.00");
				break;
			default:
				valor = new BigDecimal("0.00");
				break;
		}
	}

	@Override
	public String toString() {
		return "R$ " + valor;
	}

	@Override
	public int compareTo(Moeda outra) {
		return this.getValor().compareTo(outra.getValor());
	}
}
