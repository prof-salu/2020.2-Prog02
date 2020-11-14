package exemplo01;

public class MeuPrograma {

	public static void main(String[] args) {
		CopiadorDeArquivos arquivo = new CopiadorDeArquivos();
		BarraDeProgresso progresso = new BarraDeProgresso();
		
		arquivo.executa();
		progresso.executa();
	}
}