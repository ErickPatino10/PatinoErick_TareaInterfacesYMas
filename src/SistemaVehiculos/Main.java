package SistemaVehiculos;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Tesla", "Model S", 250, 4, 80);

        Moto moto = new Moto("Yamaha", "R6", 220, true);

        Camion camion = new Camion("Volvo", "FH16", 180, 20);

        Vehiculo[] vehiculos = {auto, moto, camion};

        for (Vehiculo v : vehiculos) {

            v.describir();

            if (v instanceof Electrico e) {
                System.out.println("Autonomia: " + e.autonomiaKm() + " km");
                e.cargarBateria(10);
            }

            System.out.println("-------------------");
        }
    }
}