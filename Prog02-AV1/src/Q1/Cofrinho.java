package Q1;

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
	
	public double calcularTotalArmazenado() {
		double total = 0;
		
		for (Moeda moeda : cofre) {
			total += moeda.getValor();
		}
		
		return total;
	}
	
	public int totalMoedasPorValor(double valor) {
		int total = 0;
		
		for (Moeda moeda : cofre) {
			if(moeda.getValor() == valor){
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
