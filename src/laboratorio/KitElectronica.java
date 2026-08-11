package laboratorio;

/**
 * Representa un kit de electrónica del laboratorio.
 */
public class KitElectronica extends Recurso {

    private int componentes;

    public KitElectronica(int idRecurso, String nombre, boolean disponible, int componentes) {

        super(idRecurso, nombre, disponible);

        this.componentes = componentes;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== Kit de Electrónica =====");
        System.out.println("ID: " + getIdRecurso());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Componentes: " + componentes);
    }
}