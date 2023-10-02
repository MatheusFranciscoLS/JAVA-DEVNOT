package GUIInicio.src;

import javax.swing.*;

public class ContainerComponentes extends JFrame {
    int clickCount = 0;

    public ContainerComponentes() {
        super("JFrame");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton but = new JButton("I am a Swing button");
        JLabel clickLabel = new JLabel("Number of button clicks: " + clickCount);

        but.addActionListener(e -> {
            clickCount++;
            clickLabel.setText("Number of button clicks: " + clickCount);
        });

        JPanel painel = new JPanel();
        painel.add(but);
        painel.add(clickLabel);

        this.getContentPane().add(painel);
        this.pack();
        this.setVisible(true);

    }
}
