package empleados;

class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bono: " + bono);
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bono;
    }
}


