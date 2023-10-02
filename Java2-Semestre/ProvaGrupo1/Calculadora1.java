    package ProvaGrupo1;

    import java.awt.GridLayout;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class Calculadora1 extends JPanel {
        public Calculadora1() {
            super();
            setLayout(new GridLayout(20, 1));
            this.add(new JLabel("Calculadora IMC"));
            JLabel label = new JLabel("Informe seu peso: ");
            JTextField peso = new JTextField(5);
            JLabel label1 = new JLabel("Informe sua altura: ");
            JTextField altura = new JTextField(5);
            JButton calcular = new JButton("Calcular");

            add(label);
            add(peso);
            add(label1);
            add(altura);
            add(calcular);

            calcular.addActionListener(e -> {
                try {
                    double pesoValue = Double.parseDouble(peso.getText());
                    double alturaValue = Double.parseDouble(altura.getText());
    
                    if (pesoValue <= 0 || alturaValue <= 0) {
                        JOptionPane.showMessageDialog(null, "Peso e altura devem ser números positivos.");
                    } else {
                        double imc = pesoValue / (alturaValue * alturaValue);
                        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
                }
            });
        }
    }