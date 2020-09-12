import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaProduto {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto(100, "Laptop", 45, 3000));
		lista.add(new Produto(101, "Mouse", 7, 100));
		lista.add(new Produto(102, "Monitor", 77, 1000));
		lista.add(new Produto(103, "Tablet", 80, 4000));
		lista.add(new Produto(104, "Pendrive", 45, 50));
		lista.add(new Produto(105, "SSD", 45, 250));
		lista.add(new Produto(106, "Memoria", 130, 430));
		lista.add(new Produto(107, "Processador", 45, 1700));
		lista.add(new Produto(108, "Headset", 12, 120));
		lista.add(new Produto(109, "Fonte", 45, 250));
		
		
		for(Produto produto : lista) {
			System.out.println(produto);
		}
		
		Collections.sort(lista);
		
		System.out.println();
		System.out.println("Lista ORDENADA");
		for(Produto produto : lista) {
			System.out.println(produto);
		}

	}

}
