import java.time.LocalDate;

public class TesteInsert {

	public static void main(String[] args) {
		Contato c1 = new Contato(101, "CLara", "clara@email.com", "Rua Z, 123", LocalDate.of(1992, 3, 21));
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(c1);
	}

}
