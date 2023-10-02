import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class Exercicio1 extends JFrame {
    public Exercicio1() {
        super("Exercicio 1");
        JPanel painel1 = new JPanel();// principal
        // elemento de seleção dos Cards JComboBox
        String itensCB[] = { "Card 1", "Card 2", "Card 3" };
        JButton b1 = new JButton("Proximo Card");
        painel1.add(b1);
        // criar os cards
        JPanel cards = new JPanel();// card principal - vai permitir a navegação
        CardLayout cl = new CardLayout();
        cards.setLayout(cl);
        // criar os cards da pilha
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("Card com Jtext", 20));
        JPanel card3 = new JPanel();
        card3.add(new JTextArea());
        // add cards a pilha
        cards.add(card1, "Card 1"); // ou itensCB[0]
        cards.add(card2, itensCB[1]); // ou "Card 2"
        cards.add(card3, "Card 3");
        painel1.add(cards);
        this.add(painel1);
        // set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        // criar a ação para o ComboBox
        b1.addActionListener(e -> {
            cl.next(cards);
        });
    }

}
