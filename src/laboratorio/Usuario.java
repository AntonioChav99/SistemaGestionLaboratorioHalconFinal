package laboratorio;

/**
 * Clase que representa a un usuario del laboratorio.
 * Hereda de la clase Persona.
 */
public class Usuario extends Persona {

    // ====== Atributo propio ======
    private String matricula;

    // ====== Constructor ======
    public Usuario(int id, String nombre, String correo, String telefono, String matricula) {

        super(id, nombre, correo, telefono);

        this.matricula = matricula;
    }

    // ====== Getter ======
    public String getMatricula() {
        return matricula;
    }

    // ====== Setter ======
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // ====== Implementación del método abstracto ======
    @Override
    public void mostrarInformacion() {

        System.out.println("===== Usuario =====");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Matrícula: " + matricula);
    }
}