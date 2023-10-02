package ProvaGrupo1;

import javax.swing.*;

public class Calculadora3 extends JPanel {
    public Calculadora3() {
        super();
        this.add(new JLabel("Calculadora Simples"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();

        JButton botaoSoma;
        JButton botaoSub;
        JButton botaoDiv;
        JButton botaoMult;
        JTextField valor1;
        JTextField valor2;
        JTextField resultado;

        JLabel label1 = new JLabel("Digite um valor:");
        valor1 = new JTextField(15);
        JLabel label2 = new JLabel("Digite um valor:");
        valor2 = new JTextField(15);
        JLabel label3 = new JLabel("Resultado:");
        resultado = new JTextField(15);
        botaoSoma = new JButton("+");
        botaoSub = new JButton("-");
        botaoDiv = new JButton("%");
        botaoMult = new JButton("*");

        this.add(painel);
        painel.add(label1);
        painel.add(valor1);

        this.add(painel1);
        painel1.add(label2);
        painel1.add(valor2);

        this.add(painel2);
        painel2.add(label3);
        painel2.add(resultado);

        this.add(painel3);
        painel3.add(botaoSoma);
        painel3.add(botaoSub);
        painel3.add(botaoDiv);
        painel3.add(botaoMult);

        botaoSoma.addActionListener(e -> {
            if (botaoSoma.getActionCommand().equals("+")) { // sempre que for comparar Strings usar o .equals
                int soma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(soma));
            }
        });
        botaoSub.addActionListener(e -> {
            if (botaoSub.getActionCommand().equals("-")) {
                int subtracao = Integer.parseInt(valor1.getText()) - Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(subtracao));
            }
        });
        botaoDiv.addActionListener(e -> {
            if (botaoDiv.getActionCommand().equals("*")) {
                int divisao = Integer.parseInt(valor1.getText()) / Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(divisao));
            }
        });
        botaoMult.addActionListener(e -> {
            if (botaoMult.getActionCommand().equals("%")) {
                int multiplicacao = Integer.parseInt(valor1.getText()) * Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(multiplicacao));
            }

        });

    }
}