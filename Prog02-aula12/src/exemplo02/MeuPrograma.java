package exemplo02;

public class MeuPrograma {

	public static void main(String[] args) {
		CopiadorDeArquivos arquivo = new CopiadorDeArquivos();
		BarraDeProgresso barraProgresso = new BarraDeProgresso();
		
		Thread t1 = new Thread(arquivo, "CopiaArquivo");
		Thread t2 = new Thread(barraProgresso, "barraProgresso");
		
		t1.start();
		t2.start();
	}
}