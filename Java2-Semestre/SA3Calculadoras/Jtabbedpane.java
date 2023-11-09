package ProvaGrupo1;

import javax.swing.JTabbedPane;

public class Jtabbedpane extends JTabbedPane {
    public Jtabbedpane() {
        super();
        this.add("Calculadora IMC", new Calculadora1());
        this.add("Calculadora 2", new Calculadora2());
        this.add("Calculadora 3", new Calculadora3());
    }
}