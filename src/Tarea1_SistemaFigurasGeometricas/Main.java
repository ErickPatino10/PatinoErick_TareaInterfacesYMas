package Tarea1_SistemaFigurasGeometricas;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = {

                new Circulo("Rojo", true, 5),
                new Circulo("Azul", false, 3),

                new Rectangulo("Verde", true, 4, 6),
                new Rectangulo("Negro", false, 8, 2),

                new TrianguloRectangulo("Amarillo", true, 3, 4),
                new TrianguloRectangulo("Blanco", false, 5, 12)
        };

        for (Figura f : figuras) {

            f.describir();
            System.out.println("----------------------");
        }
    }
}