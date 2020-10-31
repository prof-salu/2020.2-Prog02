import javax.swing.JOptionPane;

public class CaixaDeDialogo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "App para calcular a média de dois números.");
		
		String num1 = JOptionPane.showInputDialog("Digite um numero: ");
		String num2 = JOptionPane.showInputDialog("Digite um numero: ");
		
		double primNUm = Double.parseDouble(num1);
		double segNUm = Double.parseDouble(num2);
		double media = (primNUm + segNUm) / 2;
		
		JOptionPane.showMessageDialog(null, "Média dos valores: " + media);
	}

}
