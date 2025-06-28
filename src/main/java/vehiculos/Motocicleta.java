
class Motocicleta extends Vehiculo {
    boolean tieneSidecar;

    public Motocicleta(String marca, int año, boolean tieneSidecar) {
        super(marca, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}


