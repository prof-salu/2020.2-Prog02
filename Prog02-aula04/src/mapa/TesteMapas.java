package mapa;

import java.util.HashMap;
import java.util.Map;

import banco.Conta;

public class TesteMapas {
	public static void main(String[] args) {
		Conta c1 = new Conta(1234, 9988); //==> Salu
		Conta c2 = new Conta(1234, 6677); //==> Gabi
		Conta c3 = new Conta(1234, 3344); //==> Laura
		Conta c4 = new Conta(1234, 3333); 

		
		//Map<Chave, Valor>
		Map<String, Conta> mapa = new HashMap<>();
		
		mapa.put("Salu", c1);
		mapa.put("Gabi", c2);
		mapa.put("Laura", c3);
		mapa.put("Cafe", c4);
		
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		
		System.out.println(mapa.get("Gabi"));
		
		
		
		
	}
}
