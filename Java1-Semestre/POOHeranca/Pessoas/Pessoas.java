package POOHeranca.Pessoas;

public abstract class Pessoas {

    String nome;
    String endereco;
    int nCpf;
    int idade;

    // métodos - gets e seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getnCpf() {
        return nCpf;
    }

    public void setnCpf(int nCpf) {
        this.nCpf = nCpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
