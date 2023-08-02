package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // digitação de senhas
        boolean testesenha = true;
        while (testesenha) {
            String senhaDigitada = JOptionPane.showInputDialog("Informe uma Senha de pelo menos 6 Digitos");
                try{
                if (senhaDigitada.length() != 6) {
                    throw new Exception("Digite uma Senha com pelo menos 6 digitos");
                }
                JOptionPane.showMessageDialog(null, "Senha Aprovada");
                testesenha = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
                
        }
    }
