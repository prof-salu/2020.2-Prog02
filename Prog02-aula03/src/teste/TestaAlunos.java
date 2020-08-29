package teste;

import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import modelo.Automovel;

//ECLIPSE --> CTRL + SHIFT + O (organizar imports)

public class TestaAlunos {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Carlos", 7.5f);
		Aluno a2 = new Aluno("Ana", 6.5f);
		Aluno a3 = new Aluno("Bia", 10f);
		Aluno a4 = new Aluno("Mara", 8f);
		Aluno a5 = new Aluno("João", 6f);
		Aluno a6 = new Aluno("Marcus", 8.0f);
		
		System.out.println(a1.getNome());
		System.out.println(a1.getNota());
		
		//Array
		Aluno[] lista1 = new Aluno[5];
		lista1[0] = a1;
		lista1[1] = a2;
		lista1[2] = a3;
		lista1[3] = a4;
		lista1[4] = a5;
		//lista1[5] = a6;
		
		//System.out.println(lista1[0]);
		
		for(int i = 0; i < lista1.length; i++) {
			//System.out.println(lista1[i]);
		}
		
		List lista2 = new ArrayList();
		lista2.add(a1);
		lista2.add(a2);
		lista2.add(a3);
		lista2.add(a4);
		lista2.add(a5);
		lista2.add(a6);
//		lista2.add(a6);
//		lista2.add(a6);
//		lista2.add(a6);
		lista2.add("Salu");
		Automovel m1 = new Automovel();
		lista2.add(m1);
		lista2.add(new Automovel());
		
		
		for(int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		List<Aluno> lista3 = new ArrayList();
		lista3.add(a1);
		lista3.add(a2);
		lista3.add(a3);
		lista3.add(a4);
		lista3.add(a5);
		lista3.add(a6);
		//lista3.add("Salu");
		//lista3.add(new Automovel());
		
	}
}
