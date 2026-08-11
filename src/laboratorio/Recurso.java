package laboratorio;

/**
 * Clase abstracta que representa un recurso del laboratorio.
 * Es la clase padre de Laptop, Proyector y KitElectronica.
 */
public abstract class Recurso {

    // ====== Atributos ======
    private int idRecurso;
    private String nombre;
    private boolean disponible;

    // ====== Constructor ======
    public Recurso(int idRecurso, String nombre, boolean disponible) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    // ====== Getters ======
    public int getIdRecurso() {
        return idRecurso;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // ====== Setters ======
    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // ====== Método abstracto ======
    public abstract void mostrarInformacion();
}