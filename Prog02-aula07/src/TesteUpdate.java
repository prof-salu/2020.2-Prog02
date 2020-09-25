import java.time.LocalDate;

public class TesteUpdate {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		Contato c1 = 
		new Contato(101, "Clara", "clara@email.com", "Rua Sol, 167", LocalDate.of(1992, 03,21));
		
		dao.atualiza(c1);

	}

}
