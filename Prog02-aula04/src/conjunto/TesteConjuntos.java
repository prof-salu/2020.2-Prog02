package conjunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import banco.Conta;

public class TesteConjuntos {
	public static void main(String[] args) {
		Conta c1 = new Conta(1234, 9988);
		Conta c2 = new Conta(1234, 6677);
		Conta c3 = new Conta(1234, 3344);
		Conta c4 = new Conta(1234, 4455);
		Conta c5 = new Conta(1234, 1122);
		Conta c6 = new Conta(1234, 1122);

		Set<Conta> conjunto = new HashSet<>();

		System.out.println(conjunto.add(c1));
		System.out.println(conjunto.add(c2));
		System.out.println(conjunto.add(c3));
		System.out.println(conjunto.add(c4));
		System.out.println(conjunto.add(c5));

		System.out.println("Tamanho: " + conjunto.size());
		System.out.println(conjunto.add(c2)); // FALHA!
		System.out.println(conjunto.add(c6));
		System.out.println("Tamanho: " + conjunto.size());

		System.out.println(conjunto);

//		for(int i = 0; i < conjunto.size(); i++) {
//			System.out.println(conjunto.get(i));
//		}
		
		System.out.println();
		System.out.println();

//		Iterator<Conta> iterator = conjunto.iterator();				
//		while (iterator.hasNext()) {
//			Conta conta = iterator.next();
//			System.out.println(conta);
//		}
		
		//for each
		
		for(Conta item : conjunto) {
			System.out.println(item);
		}
	}
}
