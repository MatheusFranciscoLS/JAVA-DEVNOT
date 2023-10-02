package POOHeranca.Pessoas;

public class Professor extends Funcionarios {

    private String curso;
    private String turma;
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    
}
