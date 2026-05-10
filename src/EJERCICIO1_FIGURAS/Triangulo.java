package EJERCICIO1_FIGURAS;

public class Triangulo extends Figura implements Dibujable {

    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }

    @Override
    public String obtenerFormatoSVG() {
        return "<triangle base=\"" + base + "\" altura=\"" + altura + "\" fill=\"" + color + "\"/>";
    }

    @Override
    public double perimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}