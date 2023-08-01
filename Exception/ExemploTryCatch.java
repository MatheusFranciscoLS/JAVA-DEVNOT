package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Escolha uma Operação");
        boolean rodando = true;
        while (rodando) {
            try {
                int acao1 = Integer.parseInt(
                        JOptionPane.showInputDialog("1-Adição\n 2-Substração\n 3-Multiplicação\n 4-Divisão\n 5-Sair"));
                if (acao1 == 1) {
                    try {
                        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                        System.out.print("Digite um valor inteiro..:");
                        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Nº Inteiro"));
                        JOptionPane.showMessageDialog(null, "O resultado é " + (numero1 + numero2));
                        rodando = false;
                    } catch (NumberFormatException erro1) {
                        JOptionPane.showMessageDialog(null,
                                "ERRO - Valor digitado não é inteiro" + "\nDigite novamente");
                    } catch (Exception erro2) {
                        JOptionPane.showMessageDialog(null, "Aconteceu um ERRO" + "\nDigite novamente");
                    }
                } else if (acao1 == 2) {
                    try {
                        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                        System.out.print("Digite um valor inteiro..:");
                        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Nº Inteiro"));
                        JOptionPane.showMessageDialog(null, "O resultado é " + (numero1 - numero2));
                        rodando = false;
                    } catch (NumberFormatException erro1) {
                        JOptionPane.showMessageDialog(null,
                                "ERRO - Valor digitado não é inteiro" + "\nDigite novamente");
                    } catch (Exception erro2) {
                        JOptionPane.showMessageDialog(null, "Aconteceu um ERRO" + "\nDigite novamente");
                    }
                } else if (acao1 == 3) {
                    try {
                        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                        System.out.print("Digite um valor inteiro..:");
                        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Nº Inteiro"));
                        JOptionPane.showMessageDialog(null, "O resultado é " + (numero1 * numero2));
                        rodando = false;
                    } catch (NumberFormatException erro1) {
                        JOptionPane.showMessageDialog(null,
                                "ERRO - Valor digitado não é inteiro" + "\nDigite novamente");
                    } catch (Exception erro2) {
                        JOptionPane.showMessageDialog(null, "Aconteceu um ERRO" + "\nDigite novamente");
                    }
                } else if (acao1 == 4) {
                    try {
                        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                        System.out.print("Digite um valor inteiro..:");
                        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Nº Inteiro"));
                        JOptionPane.showMessageDialog(null, "O resultado é " + (numero1 / numero2));
                        rodando = false;
                    } catch (NumberFormatException erro1) {
                        JOptionPane.showMessageDialog(null,
                                "ERRO - Valor digitado não é inteiro" + "\nDigite novamente");
                    } catch (Exception erro2) {
                        JOptionPane.showMessageDialog(null,
                                "Não pode dividir por 0" + "\nDigite novamente");
                    }
                } else if (acao1 == 5) {
                    JOptionPane.showMessageDialog(null, "Você saiu da calculadora");
                    rodando = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Informe um numero válido");
                }
            } catch (NumberFormatException erro1) {
                JOptionPane.showMessageDialog(null, "ERRO - Numero não é válido" + "\nDigite novamente");
            }
        }
    }
}