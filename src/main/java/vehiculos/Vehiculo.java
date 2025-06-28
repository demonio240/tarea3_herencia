class Vehiculo {
    String marca;
    int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }
}


