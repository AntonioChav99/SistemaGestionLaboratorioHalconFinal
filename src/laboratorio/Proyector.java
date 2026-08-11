package laboratorio;

/**
 * Representa un proyector del laboratorio.
 */
public class Proyector extends Recurso {

    private int luminosidad;

    public Proyector(int idRecurso, String nombre, boolean disponible, int luminosidad) {

        super(idRecurso, nombre, disponible);

        this.luminosidad = luminosidad;
    }

    public int getLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(int luminosidad) {
        this.luminosidad = luminosidad;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== Proyector =====");
        System.out.println("ID: " + getIdRecurso());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Luminosidad: " + luminosidad + " lúmenes");
    }
}