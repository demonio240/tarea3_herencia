
class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, int año, int numeroPuertas) {
        super(marca, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Puertas: " + numeroPuertas);
    }
}


