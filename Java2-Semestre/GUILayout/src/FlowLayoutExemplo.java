import javax.swing.*;
import java.awt.*;

public class FlowLayoutExemplo {
    public FlowLayoutExemplo() {
        JFrame janela1 = new JFrame("Janela Principal");
        // Layout da JFrame padrão é GridLayout
        // Alterar para FlowLayout
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);
        // adicionar os Componentes
        JLabel texto1 = new JLabel("Nº de Botão: ");
        janela1.add(texto1);
        JTextField caixa1 = new JTextField(25);
        janela1.add(caixa1);
        JButton botao1 = new JButton("Enviar");
        janela1.add(botao1);
        //action
        botao1.addActionListener(e ->{
            int quant = Integer.parseInt(caixa1.getText());
            for (int i = 0; i < quant; i++) {
                janela1.add(new JButton(""+i));
            }
            janela1.pack();
            janela1.setVisible(true);
        });
        // set Frame
        janela1.setDefaultCloseOperation(2);
        janela1.pack();
        janela1.setVisible(true);
    }
}
