package Q1_BigDecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {
	private List<Moeda> cofre;
	
	public Cofrinho() {
		cofre = new ArrayList<>();
	}
	
	public void adicionarMoeda(Moeda moeda) {
		cofre.add(moeda);
	}
	
	public int quantidadeDeMoedasArmazenadas() {
		return cofre.size();
	}
	
	public BigDecimal calcularTotalArmazenado() {
		BigDecimal total = new BigDecimal("0.00");
		
		for (Moeda moeda : cofre) {
			total = total.add(moeda.getValor());
		}
		
		return total;
	}
	
	public int totalMoedasPorValor(ValorMoeda valor) {
		int total = 0;
		
		for (Moeda moeda : cofre) {
			if(moeda.getNome().equals(valor)){
				total++;
			}
		}
		
		return total;
	}
	
	public Moeda maiorValor() {
		Moeda moeda = Collections.max(cofre);		
		return moeda;
	}
	

	public Moeda menorValor() {
		Moeda moeda = Collections.min(cofre);		
		return moeda;
	}
}
