package GUIInicio.src;

import javax.swing.*;
import java.awt.*;

public class TestaContainer extends JFrame {
    public TestaContainer() {
        this.setBounds(50, 100, 400, 150); // Seta posição e tamanho
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        FlowLayout flow = new FlowLayout(FlowLayout.LEFT); // Define o layout do container
        this.setLayout(flow); // Seta layout do container

        for (int i = 1; i <= 6; i++)
            this.add(new JButton("Aperte " + i)); // Adiciona um botão
        this.setVisible(true); // Exibe a janela

        JLabel label = new JLabel("Exemplo de texto:");
        this.add(label);
        JTextField campo = new JTextField(15);
        this.add(campo);
        this.pack(); // Redimensiona a janela
    }
}