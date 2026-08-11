package laboratorio;

/**
 * Clase abstracta que representa a una persona dentro del sistema.
 * Es la clase padre de Usuario.
 */
public abstract class Persona {

    // ====== Atributos ======
    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    // ====== Constructor ======
    public Persona(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    // ====== Getters ======
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    // ====== Setters ======
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // ====== Método abstracto ======
    public abstract void mostrarInformacion();
}