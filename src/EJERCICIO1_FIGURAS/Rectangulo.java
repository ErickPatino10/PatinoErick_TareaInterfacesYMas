package EJERCICIO1_FIGURAS;

public class Rectangulo extends Figura implements Dibujable {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
    }

    @Override
    public String obtenerFormatoSVG() {
        return "<rect width=\"" + base + "\" height=\"" + altura + "\" fill=\"" + color + "\"/>";
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}