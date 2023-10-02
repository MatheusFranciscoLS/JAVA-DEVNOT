package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Professor;

public class App{
    public static void main(String[] args) {
        Alunos aluno01 = new Alunos();
        Funcionarios funcionario01 = new Funcionarios();
        Professor professor01 = new Professor();

        System.out.println("Aluno");
        aluno01.setNome("Matheus");
        aluno01.setEndereco("Rua das Ruas");
        aluno01.setIdade(23);
        aluno01.setnCpf(1254348932);
        aluno01.setnMatricula(129873);
        aluno01.setTurma("Noite");
        aluno01.setCurso("Desenvolvimento de Sistemas");

        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Endereço: " + aluno01.getEndereco());
        System.out.println("Idade: " + aluno01.getIdade());
        System.out.println("CPF: " + aluno01.getnCpf());
        System.out.println("Nº Matricula: " + aluno01.getnMatricula());
        System.out.println("Turma: " + aluno01.getTurma());
        System.out.println("Curso: " + aluno01.getCurso());

        System.out.println("===================================================");

        System.out.println("Professor");
        funcionario01.setNome("Diogo");
        funcionario01.setEndereco("Rua das ruas, 137 ");
        funcionario01.setIdade(38);
        funcionario01.setnIdentidade(71748236);
        funcionario01.setTurno("Noite");
        funcionario01.setSetor("Professor");
        professor01.setCurso("Desenvolvimento de Sistemas");
        professor01.setTurma("Turma A");
        System.out.println("Nome: " + funcionario01.getNome());
        System.out.println("Endereço: " + funcionario01.getEndereco());
        System.out.println("Idade: " + funcionario01.getIdade());
        System.out.println("Nº Identidade: " + funcionario01.getnIdentidade());
        System.out.println("Turno: " + funcionario01.getTurno());
        System.out.println("Função: " + funcionario01.getSetor());
        System.out.println("Curso: " + professor01.getCurso());
        System.out.println("Turma:" + professor01.getTurma());
    }
}
