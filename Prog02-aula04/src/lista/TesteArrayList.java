package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import banco.Conta;

public class TesteArrayList {

	public static void main(String[] args) {
		Conta c1 = new Conta(1234, 9988);
		Conta c2 = new Conta(1234, 6677);
		Conta c3 = new Conta(1234, 3344);
		Conta c4 = new Conta(1234, 4455);
		Conta c5 = new Conta(1234, 1122);	
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c5);
		lista.add(c5);
		lista.add(c5);
		lista.add(c5);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Conta c6 = new Conta(1234, 3311);
		lista.add(2, c6);
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//lista.remove(4);
		lista.remove(c4);
		
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(lista.contains(c1));
		System.out.println(lista.contains(c4));
		
		Collections.sort(lista);
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}

}
