import javax.swing.JTabbedPane;

public class jtabbedpane extends JTabbedPane{
    public jtabbedpane () {
    super();
        this.add("Cadastro Usuarios", new CadastroUsuarios());
        this.add("Cadastro Agenda",new CadastroAgenda());
    }
}
