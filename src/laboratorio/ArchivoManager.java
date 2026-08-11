package laboratorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase encargada de guardar información en un archivo de texto.
 */
public class ArchivoManager {

    private final String nombreArchivo;

    public ArchivoManager(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Guarda texto dentro del archivo.
     */
    public void guardar(String contenido) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {

            writer.write(contenido);

            System.out.println("Información guardada correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo: " + e.getMessage());

        }

    }

}