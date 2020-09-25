import java.time.LocalDate;

public class TesteInsert {

	public static void main(String[] args) {
		Contato c1 = new Contato
		(103, "Joao", "joa1o@email.com", "Rua B, 123", LocalDate.of(1981, 11, 21));
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(c1);
	}

}
