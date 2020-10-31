package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Produto;
import modelo.ProdutoDAO;
import visao.VisaoProduto;

public class ControleProduto {
	private VisaoProduto visao;

	public ControleProduto() {
		visao = new VisaoProduto();
	}

	public void manterProduto() {
		switch (visao.lerMenu()) {
		case 0:
			// encerra
			visao.encerrar();
			break;
		case 1:
			// gravar
			gravar();
			break;
		case 2:
			// apagar
			apagar();
			break;
		case 3:
			// atualizar
			atualizar();
			break;
		case 4:
			// consultar
			consultar();
			break;
		default:
			break;
		}
	}

	private void gravar() {
		Produto produto = new Produto();

		produto.setCodigo(visao.lerCodigo());
		produto.setDescricao(visao.lerDescricao());
		produto.setPreco(visao.lerPreco());
		produto.setQuantidade(visao.lerQuantidade());

		ProdutoDAO dao = new ProdutoDAO();
		dao.adiciona(produto);

		manterProduto();
	}

	private void consultar() {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = new ArrayList<>();
		lista = dao.getProdutos();

		for (Produto produto : lista) {
			System.out.println(produto);
		}

		manterProduto();
	}

	private void atualizar() {
		Produto produto = new Produto();

		produto.setCodigo(visao.lerCodigo());
		produto.setDescricao(visao.lerDescricao());
		produto.setPreco(visao.lerPreco());
		produto.setQuantidade(visao.lerQuantidade());

		ProdutoDAO dao = new ProdutoDAO();
		dao.altera(produto);

		manterProduto();
	}

	private void apagar() {
		Produto produto = new Produto();
		produto.setCodigo(visao.lerCodigo());

		ProdutoDAO dao = new ProdutoDAO();
		dao.apaga(produto);

		manterProduto();
	}

}
