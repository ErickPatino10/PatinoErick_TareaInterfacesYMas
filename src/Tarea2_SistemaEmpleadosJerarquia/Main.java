package Tarea2_SistemaEmpleadosJerarquia;

public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = {

                new EmpleadoPorHora("Carlos", 1, 40, 8),
                new EmpleadoPorHora("Ana", 2, 35, 10),

                new EmpleadoFijo("Luis", 3, 40, 900),
                new EmpleadoFijo("Maria", 4, 40, 1200),

                new EmpleadoComision("Pedro", 5, 40,
                        700, 10, 5000),

                new EmpleadoComision("Sofia", 6, 40,
                        800, 15, 7000)
        };

        for (Empleado e : empleados) {

            e.mostrarInfo();

            if (e instanceof Bonificable b) {

                System.out.println("Bono: "
                        + b.calcularBono());
            }

            System.out.println("----------------------");
        }
    }
}