package ProjetoFinal1SemestreJOption.Conta;

import javax.swing.JOptionPane;

public abstract class Conta {
    String nome;
    int nConta;
    double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque() {
        double sacar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar: "));
        if (sacar <= saldo) {
            saldo -= sacar;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"
                    + "\n Saldo atual: "
                    + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
    }

    public void deposito() {
        double depositar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar: "));
        saldo += depositar;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!"
                + "\n Saldo atual: "
                + saldo);
    }

}
