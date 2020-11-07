package helper;

import modelo.Produto;
import visao.VisaoProduto;

public class VisaoProdutoHelper {
	private VisaoProduto visao;
	
	public VisaoProdutoHelper(VisaoProduto visao) {
		this.visao = visao;
	}
	
	public Produto pegaProduto() {
		Produto produto = new Produto();
		
		produto.setCodigo(Integer.parseInt(visao.getTxtCodigo().getText()));
		produto.setDescricao(visao.getTxtDescricao().getText());
		produto.setQuantidade(Integer.parseInt(visao.getTxtQuantidade().getText()));
		produto.setPreco(Double.parseDouble(visao.getTxtPreco().getText()));
		
		return produto;
	}
	
	public boolean formularioEmBranco() {
		return (visao.getTxtCodigo().getText().isEmpty() ||
				visao.getTxtDescricao().getText().isEmpty() || 
				visao.getTxtPreco().getText().isEmpty() ||
				visao.getTxtQuantidade().getText().isEmpty());
	}
	
	public void limparFormulario() {
		visao.getTxtCodigo().setText("");
		visao.getTxtDescricao().setText("");
		visao.getTxtQuantidade().setText("");
		visao.getTxtPreco().setText("");
	}
	
	public void PreencheFormulario(Produto produto) {
		visao.getTxtCodigo().setText(Integer.toString(produto.getCodigo()));
		visao.getTxtDescricao().setText(produto.getDescricao());
		visao.getTxtQuantidade().setText(Integer.toString(produto.getQuantidade()));
		visao.getTxtPreco().setText(Double.toString(produto.getPreco()));
	}
}
