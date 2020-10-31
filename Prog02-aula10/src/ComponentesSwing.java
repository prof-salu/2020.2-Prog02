import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Salustiano Oliveira <saluorodrigues@gmail.com>
 */
public class ComponentesSwing extends JFrame {

    private JPanel painelNorte = new JPanel();
    private JPanel painelLeste = new JPanel();
    private JPanel painelOeste = new JPanel();
    private JPanel painelSul = new JPanel();
    private JPanel painelCentral = new JPanel();

    private JButton botao = new JButton("Sou um botao");
    private JLabel texto = new JLabel("Eu sou um label");
    private JTextField textoEntrada = new JTextField("Digite algo", 10);
    private JPasswordField senha = new JPasswordField(10);

    private JTextArea areaTexto = new JTextArea(10, 20);
    private JScrollPane areaTextoScroll = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

    private JCheckBox opt1 = new JCheckBox("Opcao 1");
    private JCheckBox opt2 = new JCheckBox("Opcao 2");
    private JCheckBox opt3 = new JCheckBox("Opcao 3");

    private ButtonGroup escolha = new ButtonGroup();
    private JRadioButton optSim = new JRadioButton("Sim");
    private JRadioButton optNao = new JRadioButton("Nao");
    private JRadioButton optTalvez = new JRadioButton("Talvez");

    private String[] opcoesComboBox = {"Rio de Janeiro", "Sao Paulo", "Minas Gerais", "Espirito Santo"};
    private JComboBox comboBox = new JComboBox(opcoesComboBox);

    private String[] nomes = {"Carlos", "Mariano", "Juliana", "Laura"};
    private JList lista = new JList(nomes);

    private JMenuBar barra = new JMenuBar();
    private JMenu menuArquivo = new JMenu("Arquivo");
    private JMenuItem itemNovo = new JMenuItem("Novo");
    private JMenuItem itemAbrir = new JMenuItem("Abrir");
    private JMenuItem itemSalvar = new JMenuItem("Salvar");
    private JMenuItem itemSair = new JMenuItem("Sair");
    private JMenu menuAjuda = new JMenu("Ajuda");
    private JMenuItem itemConteudo = new JMenuItem("Conteudo");
    private JMenuItem itemSobre = new JMenuItem("Sobre");

    private BorderLayout layout = new BorderLayout();

    public ComponentesSwing() {
        super("Componentes de interface");
    }

    public void init() {
        setBounds(-1920, 100, 700, 300);

        senha.setEchoChar('\u2665');

        getContentPane().setLayout(layout);
        getContentPane().add(painelNorte, BorderLayout.NORTH);
        getContentPane().add(painelLeste, BorderLayout.EAST);
        getContentPane().add(painelOeste, BorderLayout.WEST);
        getContentPane().add(painelCentral, BorderLayout.CENTER);
        getContentPane().add(painelSul, BorderLayout.SOUTH);
        painelNorte.add(botao);
        painelNorte.add(texto);
        painelNorte.add(textoEntrada);
        painelNorte.add(senha);

        menuArquivo.add(itemNovo);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(itemSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);
        menuAjuda.add(itemConteudo);
        menuAjuda.addSeparator();
        menuAjuda.add(itemSobre);
        barra.add(menuArquivo);
        barra.add(menuAjuda);
        setJMenuBar(barra);

        painelLeste.add(areaTextoScroll);

        painelOeste.add(opt1);
        opt1.setSelected(true);
        painelOeste.add(opt2);
        painelOeste.add(opt3);

        escolha.add(optSim);
        escolha.add(optNao);
        escolha.add(optTalvez);

        painelSul.add(optSim);
        painelSul.add(optNao);
        painelSul.add(optTalvez);

        painelNorte.add(comboBox);

        lista.setPreferredSize(new Dimension(100, 100));
        lista.setSelectionMode(JList.HORIZONTAL_WRAP);
        painelCentral.add(lista);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ComponentesSwing frame = new ComponentesSwing();
        frame.init();
    }
}
