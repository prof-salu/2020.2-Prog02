package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Component;

public class VisaoProduto extends JFrame {

	private JPanel painel;
	private JPanel panelForm;
	private JPanel painelBtn;
	private JLabel lblNewLabel;
	private JTextField txtCodigo;
	private JLabel lblNewLabel_1;
	private JTextField txtDescricao;
	private JLabel lblNewLabel_2;
	private JTextField txtPreco;
	private JLabel lblNewLabel_3;
	private JTextField txtQuantidade;
	private JButton btnGravar;
	private JButton btnEditar;
	private JButton btnApagar;
	private JButton btnConsultar;
	private JButton btnListarTodos;

	public VisaoProduto() {
		setAlwaysOnTop(true);
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 242);
		
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(0, 0));
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(new BorderLayout(0, 0));
		
		panelForm = new JPanel();
		panelForm.setMinimumSize(new Dimension(350, 200));
		painel.add(panelForm, BorderLayout.CENTER);
		GridBagLayout gbl_panelForm = new GridBagLayout();
		gbl_panelForm.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelForm.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelForm.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelForm.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelForm.setLayout(gbl_panelForm);
		
		lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panelForm.add(lblNewLabel, gbc_lblNewLabel);
		
		txtCodigo = new JTextField();
		GridBagConstraints gbc_txtCodigo = new GridBagConstraints();
		gbc_txtCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigo.gridx = 3;
		gbc_txtCodigo.gridy = 0;
		panelForm.add(txtCodigo, gbc_txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panelForm.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtDescricao = new JTextField();
		GridBagConstraints gbc_txtDescricao = new GridBagConstraints();
		gbc_txtDescricao.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescricao.gridx = 3;
		gbc_txtDescricao.gridy = 1;
		panelForm.add(txtDescricao, gbc_txtDescricao);
		txtDescricao.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Pre\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		panelForm.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtPreco = new JTextField();
		GridBagConstraints gbc_txtPreco = new GridBagConstraints();
		gbc_txtPreco.insets = new Insets(0, 0, 5, 0);
		gbc_txtPreco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPreco.gridx = 3;
		gbc_txtPreco.gridy = 2;
		panelForm.add(txtPreco, gbc_txtPreco);
		txtPreco.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Quantidade:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		panelForm.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtQuantidade = new JTextField();
		GridBagConstraints gbc_txtQuantidade = new GridBagConstraints();
		gbc_txtQuantidade.insets = new Insets(0, 0, 5, 0);
		gbc_txtQuantidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtQuantidade.gridx = 3;
		gbc_txtQuantidade.gridy = 3;
		panelForm.add(txtQuantidade, gbc_txtQuantidade);
		txtQuantidade.setColumns(10);
		
		painelBtn = new JPanel();
		painelBtn.setPreferredSize(new Dimension(320, 70));
		painel.add(painelBtn, BorderLayout.SOUTH);
		
		btnGravar = new JButton("Gravar");
		painelBtn.add(btnGravar);
		
		btnEditar = new JButton("Editar");
		painelBtn.add(btnEditar);
		
		btnApagar = new JButton("Apagar");
		painelBtn.add(btnApagar);
		
		btnConsultar = new JButton("Consultar");
		painelBtn.add(btnConsultar);
		
		btnListarTodos = new JButton("Listar todos");
		painelBtn.add(btnListarTodos);
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(JTextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public JTextField getTxtPreco() {
		return txtPreco;
	}

	public void setTxtPreco(JTextField txtPreco) {
		this.txtPreco = txtPreco;
	}

	public JTextField getTxtQuantidade() {
		return txtQuantidade;
	}

	public void setTxtQuantidade(JTextField txtQuantidade) {
		this.txtQuantidade = txtQuantidade;
	}

	public JButton getBtnGravar() {
		return btnGravar;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public JButton getBtnApagar() {
		return btnApagar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public JButton getBtnListarTodos() {
		return btnListarTodos;
	}
}
