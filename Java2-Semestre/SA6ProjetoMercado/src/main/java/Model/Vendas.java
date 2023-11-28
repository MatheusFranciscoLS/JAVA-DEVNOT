package Model;

public class Vendas {

    private String cpf;
    private String codBarras;
    private String quantidade;

    public Vendas(String cpf, String codBarras, String quantidade) {
        this.cpf = cpf;
        this.codBarras = codBarras;
        this.quantidade = quantidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getquantidade() {
        return quantidade;
    }

    public void setquantidade(String quantidade) {
        this.quantidade = quantidade;
    }

}
