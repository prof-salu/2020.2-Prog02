import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MeuContaniner extends JFrame{
	
	// CTRL + SHIFT + O
	
	public MeuContaniner() {
		super("Meu app");
	}
	
	public void init() {
		JPanel painel = new JPanel();
		JButton btnBotao = new JButton("Sou um botão");
		JLabel lblTexto = new JLabel("Eu sou um label");
		
		getContentPane().add(painel);
		
		painel.add(lblTexto);
		painel.add(btnBotao);
		
		setBounds(-1920, 0, 400, 150);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MeuContaniner frame = new MeuContaniner();
		
		frame.init();
	}

}
