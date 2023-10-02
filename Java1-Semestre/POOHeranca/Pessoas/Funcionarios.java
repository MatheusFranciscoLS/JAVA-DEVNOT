package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas{
    
    int nIdentidade;
    String turno;
    String setor;
    
    public int getnIdentidade() {
        return nIdentidade;
    }
    public void setnIdentidade(int nIdentidade) {
        this.nIdentidade = nIdentidade;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    
}
