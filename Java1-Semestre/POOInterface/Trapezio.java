package POOInterface;

public class Trapezio implements FiguraGeometrica {

    int bMaior;
    int bMenor;
    int altura;
    int ladoA;
    int ladoB;

    public Trapezio(int bMaior, int bMenor, int altura, int ladoA, int ladoB) {
        this.bMaior = bMaior;
        this.bMenor = bMenor;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double getArea() {
        int area = (bMaior + bMenor) * altura / 2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Trapezio";
    }

    @Override
    public double getPerimetro() {
        int perimetro = bMaior + bMenor + ladoA + ladoB;
        return perimetro;
    }
}
