package laboratorio;

import java.util.ArrayList;

/**
 * Clase que administra el inventario del laboratorio.
 */
public class Inventario {

    // ====== Estructuras de datos ======
    private ArrayList<Usuario> usuarios;
    private ArrayList<Recurso> recursos;
    private ArrayList<Prestamo> prestamos;

    // ====== Constructor ======
    public Inventario() {

        usuarios = new ArrayList<>();
        recursos = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    // ====== Agregar usuario ======
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // ====== Agregar recurso ======
    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    // ====== Agregar préstamo ======
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    // ====== Buscar usuario por ID ======
    public Usuario buscarUsuario(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    // ====== Buscar recurso por ID ======
    public Recurso buscarRecurso(int idRecurso) {

        for (Recurso recurso : recursos) {

            if (recurso.getIdRecurso() == idRecurso) {
                return recurso;
            }
        }

        return null;
    }

    // ====== Registrar préstamo ======
    public boolean registrarPrestamo(int idUsuario, int idRecurso, int idPrestamo) {

        Usuario usuario = buscarUsuario(idUsuario);
        Recurso recurso = buscarRecurso(idRecurso);

        if (usuario == null || recurso == null) {
            return false;
        }

        if (!recurso.isDisponible()) {
            return false;
        }

        Prestamo prestamo = new Prestamo(
                idPrestamo,
                usuario,
                recurso,
                java.time.LocalDate.now());

        prestamo.registrarPrestamo();

        prestamos.add(prestamo);

        return true;
    }

    // ====== Registrar devolución ======
    public boolean registrarDevolucion(int idPrestamo) {

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getIdPrestamo() == idPrestamo && prestamo.isActivo()) {

                prestamo.devolverRecurso();

                return true;
            }
        }

        return false;
    }    // ====== Mostrar usuarios ======
    public void mostrarUsuarios() {

        System.out.println("\n===== LISTA DE USUARIOS =====");

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        for (Usuario usuario : usuarios) {
            usuario.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }

    // ====== Mostrar recursos ======
    public void mostrarRecursos() {

        System.out.println("\n===== LISTA DE RECURSOS =====");

        if (recursos.isEmpty()) {
            System.out.println("No hay recursos registrados.");
            return;
        }

        for (Recurso recurso : recursos) {
            recurso.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }

    // ====== Mostrar préstamos ======
    public void mostrarPrestamos() {

        System.out.println("\n===== LISTA DE PRÉSTAMOS =====");

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarPrestamo();
            System.out.println("-----------------------------");
        }
    }
}