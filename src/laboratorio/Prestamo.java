package laboratorio;

import java.time.LocalDate;

/**
 * Clase que representa un préstamo de un recurso.
 */
public class Prestamo {

    // ====== Atributos ======
    private int idPrestamo;
    private Usuario usuario;
    private Recurso recurso;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean activo;

    // ====== Constructor ======
    public Prestamo(int idPrestamo, Usuario usuario, Recurso recurso, LocalDate fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.usuario = usuario;
        this.recurso = recurso;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
        this.activo = true;
    }

    // ====== Getters ======
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isActivo() {
        return activo;
    }

    // ====== Setters ======
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // ====== Registrar préstamo ======
    public void registrarPrestamo() {
        recurso.setDisponible(false);
        activo = true;
    }

    // ====== Registrar devolución ======
    public void devolverRecurso() {
        recurso.setDisponible(true);
        fechaDevolucion = LocalDate.now();
        activo = false;
    }

    // ====== Mostrar información ======
    public void mostrarPrestamo() {

        System.out.println("===== PRÉSTAMO =====");
        System.out.println("ID: " + idPrestamo);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Recurso: " + recurso.getNombre());
        System.out.println("Fecha préstamo: " + fechaPrestamo);
        System.out.println("Fecha devolución: " + fechaDevolucion);
        System.out.println("Activo: " + activo);
    }
}