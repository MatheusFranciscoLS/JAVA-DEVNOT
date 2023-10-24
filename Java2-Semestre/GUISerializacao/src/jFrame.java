import javax.swing.JFrame;


public class jFrame extends JFrame{
    public jFrame (){
        setTitle("Cadastro");
                this.add(new jtabbedpane());
        //set frame
        this.setBounds(500, 100, 500, 500);
        this.setVisible(true);
    }
}
