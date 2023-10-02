package POOInterface;

/**
 * Quadrado
 */
public class Quadrado implements FiguraGeometrica {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    public double getPerimetro() {
        int perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }

    public String getNomeFigura() {
        return "Quadrado";
    }

}