package vehiculos;


public class MainVehiculos {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 2020, 4);
        Motocicleta miMoto = new Motocicleta("Honda", 2022, false);

        System.out.println("Detalles del Coche:");
        miCoche.mostrarDetalles();

        System.out.println("\nDetalles de la Motocicleta:");
        miMoto.mostrarDetalles();
    }
}


