import javax.swing.JFrame;

public class MeuFrame extends JFrame{
	
	public MeuFrame() {
		super("Minha primeira janela");
	}
	
	public void init() {
		//Define o posicionamento e o tamanho do frame
		setBounds(-1920, 0, 1024, 768);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MeuFrame frame = new MeuFrame();
		
		frame.init();
	}
}
