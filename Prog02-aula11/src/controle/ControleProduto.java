package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import helper.VisaoProdutoHelper;
import modelo.Produto;
import modelo.ProdutoDAO;
import visao.VisaoProduto;

public class ControleProduto {
	private VisaoProduto visao;
	private Produto modelo;
	private VisaoProdutoHelper helper;

	public ControleProduto() {
		visao = new VisaoProduto();
		visao.setVisible(true);
		modelo = new Produto();
		helper = new VisaoProdutoHelper(visao);

		initControleProduto();
	}

	private void initControleProduto() {
		visao.getBtnGravar().addActionListener(new ActionListener() {
			// Classe anonima
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (!helper.formularioEmBranco()) {
					modelo = helper.pegaProduto();
					ProdutoDAO dao = new ProdutoDAO();

					if (dao.adiciona(modelo)) {
						JOptionPane.showMessageDialog(visao, "Produto cadastrado com sucesso!");
						helper.limparFormulario();
					} else {
						JOptionPane.showMessageDialog(visao, "Erro ao gravar o produto", "Falha",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(visao, "Todos os campos devem ser preenchidos", "Falha",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		visao.getBtnConsultar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String codigo = JOptionPane.showInputDialog(visao, "Informe o código do produto: ");

				if (codigo == null || codigo.isEmpty()) {
					return;
				}

				ProdutoDAO dao = new ProdutoDAO();
				modelo = dao.getProduto(Integer.parseInt(codigo));

				if (modelo == null) {
					JOptionPane.showMessageDialog(visao, "Produto não encontrado", "Falha",
							JOptionPane.WARNING_MESSAGE);
					helper.limparFormulario();
				} else {
					helper.PreencheFormulario(modelo);
				}
			}
		});

		visao.getBtnEditar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ProdutoDAO dao = new ProdutoDAO();

				if (!helper.formularioEmBranco()) {
					modelo = helper.pegaProduto();

					if (dao.altera(modelo)) {
						JOptionPane.showMessageDialog(visao, "Produto alterado com sucesso!");
						helper.limparFormulario();
					} else {
						JOptionPane.showMessageDialog(visao, "Erro ao alterar o produto.", "Erro!",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(visao, "Todos os campos devem ser preenchidos", "Falha",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		visao.getBtnApagar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ProdutoDAO dao = new ProdutoDAO();
				
				if(!helper.formularioEmBranco()) {
					modelo = helper.pegaProduto();
					
					if(dao.apaga(modelo)) {
						JOptionPane.showMessageDialog(visao, "Produto apagado com sucesso!");
						helper.limparFormulario();
					} else {
						JOptionPane.showMessageDialog(visao, "Erro ao apagar o produto.", "Erro!",
								JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(visao, "Todos os campos devem ser preenchidos", "Falha",
							JOptionPane.WARNING_MESSAGE);
				}				
			}
		});
		
		visao.getBtnListarTodos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ProdutoDAO dao = new ProdutoDAO();
				List<Produto> lista = dao.getProdutos();
				
				String produtos = "";
				
				for(Produto produto:lista) {
					produtos += produto + "\n";
				}
				
				JOptionPane.showMessageDialog(visao, produtos);
			}
		});
	}
}
