import java.util.List;

public class TesteSelect {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> lista = dao.getLista();

		for (Contato contato : lista) {
			System.out.println(contato);
		}
	}
}
