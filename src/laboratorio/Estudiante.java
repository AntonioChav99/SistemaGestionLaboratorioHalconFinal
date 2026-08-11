package laboratorio;

/**
 * Clase que representa a un estudiante.
 * Hereda de Usuario.
 */
public class Estudiante extends Usuario {

    // ====== Atributo propio ======
    private String carrera;

    // ====== Constructor ======
    public Estudiante(int id, String nombre, String correo, String telefono,
                      String matricula, String carrera) {

        super(id, nombre, correo, telefono, matricula);

        this.carrera = carrera;
    }

    // ====== Getter ======
    public String getCarrera() {
        return carrera;
    }

    // ====== Setter ======
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // ====== Sobrescritura del método ======
    @Override
    public void mostrarInformacion() {

        System.out.println("===== Estudiante =====");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Carrera: " + carrera);
    }
}