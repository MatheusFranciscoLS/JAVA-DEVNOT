import javax.swing.*;
import java.awt.*;

public class LayoutCalculadoraGUI {
    public LayoutCalculadoraGUI() {
        // construir o Layout de uma calculadora
        JFrame janelaP = new JFrame("Layout Calculadora");
        BorderLayout border = new BorderLayout();

        JPanel painelT = new JPanel();
        painelT.setLayout(border);
        painelT.add(new JTextField("Digite Algo"));
        janelaP.add(painelT, BorderLayout.NORTH);

        // NÃO É RECOMENDADO COLOCAR ITENS DIRETO NO FRAME , CONFORME ABAIXO :
        // JTextField texto = new JTextField("Digite Algo");
        // janelaP.add(texto,BorderLayout.NORTH);

        JPanel painelB = new JPanel(); // Padrão FlowLayout
        janelaP.getContentPane().add(painelB);

        // set Layout do JPanel
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);
        // Vetor com os textos dos botões
        String textBotoes[] = { "C", "9", "8", "7", "/", "6", "5", "4", "*", "3", "2", "1", "-", "+", "0", "=" };
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }
        // set do Frame
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
