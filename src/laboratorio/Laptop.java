package laboratorio;

/**
 * Representa una laptop del laboratorio.
 */
public class Laptop extends Recurso {

    private String procesador;

    public Laptop(int idRecurso, String nombre, boolean disponible, String procesador) {

        super(idRecurso, nombre, disponible);

        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== Laptop =====");
        System.out.println("ID: " + getIdRecurso());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Procesador: " + procesador);
    }
}