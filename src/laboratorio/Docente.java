package laboratorio;

/**
 * Clase que representa a un docente.
 * Hereda de Usuario.
 */
public class Docente extends Usuario {

    // ====== Atributo propio ======
    private String departamento;

    // ====== Constructor ======
    public Docente(int id, String nombre, String correo, String telefono,
                   String matricula, String departamento) {

        super(id, nombre, correo, telefono, matricula);

        this.departamento = departamento;
    }

    // ====== Getter ======
    public String getDepartamento() {
        return departamento;
    }

    // ====== Setter ======
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // ====== Sobrescritura del método ======
    @Override
    public void mostrarInformacion() {

        System.out.println("===== Docente =====");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Departamento: " + departamento);
    }
}