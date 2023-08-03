package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // digitação de senhas
        boolean testesenha = true;
        while (testesenha) {
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento [dd/mm/aa]");
            dataNascimento = dataNascimento.replace("/", "");
            String senhaDigitada = JOptionPane.showInputDialog("Informe uma Senha de pelo menos 6 Digitos");
            try {
                if (senhaDigitada.length() != 6) {
                    throw new Exception("Digite uma Senha com pelo menos 6 digitos");
                }
                if (dataNascimento.equals(senhaDigitada)) {
                    throw new Exception("A senha não pode ser igual a data de nascimento");
                }
                if (login.equals(senhaDigitada)) {
                    throw new Exception("O login não pode ser igual a senha");
                }
                JOptionPane.showMessageDialog(null, "Senha Aprovada");
                testesenha = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.WARNING_MESSAGE);
            }
        }

    }
}
