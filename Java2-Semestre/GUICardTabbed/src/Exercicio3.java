import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        super("Exercicio 3");
        JPanel painel1 = new JPanel();
        String itensCB[] = { "Card 1", "Card 2", "Card 3" };
        JButton b1 = new JButton("Inicio");
        JButton b2 = new JButton("Login");
        JButton b3 = new JButton("Cadastro");
        JButton b1card1 = new JButton("Next");
        JButton b1card2 = new JButton("Next");
        JButton b2card2 = new JButton("Previous");
        JButton b2card3 = new JButton("Previous");

        painel1.add(b1);
        painel1.add(b2);
        painel1.add(b3);

        JPanel cards = new JPanel();// card principal - vai permitir a navegação
        CardLayout cl = new CardLayout();
        cards.setLayout(cl);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Seja Bem Vindo, Escolha sua Ação"));
        card1.add(b1card1);

        JPanel card2 = new JPanel();
        card2.setLayout(new BoxLayout(card2, BoxLayout.Y_AXIS));
        card2.add(new JLabel("Login"));
        card2.add(new JTextField(15));
        card2.add(new JLabel("Senha"));
        card2.add(new JTextField(15));
        card2.add(b1card2);
        card2.add(b2card2);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Cadastre-se"));
        card3.add(new JLabel("Cadastro"));
        card3.add(new JTextField(15));
        card3.add(new JLabel("Senha"));
        card3.add(new JTextField(15));
        card3.add(b2card3);

        cards.add(card1, "Card 1"); // ou itensCB[0]
        cards.add(card2, itensCB[1]); // ou "Card 2"
        cards.add(card3, "Card 3");

        painel1.add(cards);

        this.add(painel1);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 800, 500);
        this.setVisible(true);

        b1.addActionListener(e -> {
            cl.show(cards, "Card 1");
        });
        b2.addActionListener(e -> {
            cl.show(cards, "Card 2");
        });
        b3.addActionListener(e -> {
            cl.show(cards, "Card 3");
        });

        b1card1.addActionListener(e -> {
            cl.next(cards);
        });
        b1card2.addActionListener(e -> {
            cl.next(cards);
        });
        b2card2.addActionListener(e -> {
            cl.previous(cards);
        });
        b2card3.addActionListener(e -> {
            cl.previous(cards);
        });
    }
}
