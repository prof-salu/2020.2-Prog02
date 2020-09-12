import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestaMapaAluno {

	public static void main(String[] args) {
		Map<String, Aluno> mapa = new HashMap<>();
		
		Aluno a1 = new Aluno("1234", "Joana", "Banco de dados");
		Aluno a2 = new Aluno("7878", "Pedro", "Contabilidade");
		Aluno a3 = new Aluno("4231", "Carlos", "Direito");
		Aluno a4 = new Aluno("5698", "Miguel", "Jornalismo");
		Aluno a5 = new Aluno("7777", "Laura", "Artes");
		
		mapa.put(a1.getMatricula(), a1);
		mapa.put(a2.getMatricula(), a2);
		mapa.put(a3.getMatricula(), a3);
		mapa.put(a4.getMatricula(), a4);
		mapa.put(a5.getMatricula(), a5);
		
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			String matricula;
			System.out.println("Digite uma matricula: ");
			matricula = teclado.nextLine();
			
			if(matricula.equals("0000")) {
				System.out.println("Fim do programa");
				break;
			}
			
			if(mapa.containsKey(matricula)) {
				System.out.print("Aluno encontrado: ==> ");
				System.out.println(mapa.get(matricula));
			}else {
				System.out.println("Aluno nao encontrado!");
			}
		}
		
		teclado.close();

	}

}
