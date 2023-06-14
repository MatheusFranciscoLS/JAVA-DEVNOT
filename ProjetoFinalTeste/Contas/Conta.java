package ProjetoFinalTeste.Contas;

public abstract class Conta {
    //atributos
    String nome;
    int nConta;
    double saldo;
    //set get
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

    //método vazio
    public void saque() {
        
    }
}