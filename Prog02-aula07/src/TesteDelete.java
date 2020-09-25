
public class TesteDelete {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		Contato c1 = new Contato();
		c1.setId(103);
		
		dao.apaga(c1);
	}
}
