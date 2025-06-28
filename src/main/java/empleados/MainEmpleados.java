package empleados;



public class MainEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Perez", 3000);
        Gerente gerente1 = new Gerente("Maria Lopez", 5000, 1000);

        System.out.println("Detalles del Empleado:");
        empleado1.mostrarDetalles();
        System.out.println("Salario Anual del Empleado: " + empleado1.calcularSalarioAnual());

        System.out.println("\nDetalles del Gerente:");
        gerente1.mostrarDetalles();
        System.out.println("Salario Anual del Gerente: " + gerente1.calcularSalarioAnual());
    }
}


