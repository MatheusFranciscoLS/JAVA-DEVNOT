package POOIntroducao;

public class App {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno();

        // modificar os atributos(set)
        aluno1.setNome("Matheus");
        aluno1.setEndereco("Rua das ruas, 123");
        aluno1.setIdade(23);
        aluno1.setNotaMatematica(5);
        aluno1.setNotaPortugues(9);
        aluno1.setNotaCiencias(4);

        // acessar os atributos (get)
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Média:" + aluno1.getMedia());

    }
}
