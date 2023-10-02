package GUIInicio.src;

import javax.swing.*;

public class Exercicio extends JFrame {
    int clickCount = 1;
    JPanel painel;

    public Exercicio() {
        super("Exercicio");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        painel = new JPanel();
        createButton();
        this.getContentPane().add(painel);
        this.pack();
        this.setVisible(true);

    }

    private void createButton() {
        JButton button = new JButton("Button" + clickCount);

        button.addActionListener(e -> {
            clickCount++;
            createButton();
        });

        painel.add(button);
    }
}