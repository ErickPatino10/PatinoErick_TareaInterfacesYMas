package SistemaVehiculos;

public class Moto extends Vehiculo {
    private boolean deportiva;

    public Moto(String marca, String modelo,double velocidadMaxima, boolean deportiva) {
        super(marca, modelo, velocidadMaxima);
        this.deportiva = deportiva;
    }

    @Override
    public void describir() {
        System.out.println("=== MOTO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Deportiva: " + deportiva);
    }
}