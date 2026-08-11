package laboratorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Inventario inventario = new Inventario();

        ArchivoManager archivoManager =
                new ArchivoManager("LaboratorioHalcon.txt");

        int opcion;

        do {

            System.out.println();
            System.out.println("===============================================");
            System.out.println("   SISTEMA DE GESTIÓN DEL LABORATORIO HALCÓN");
            System.out.println("===============================================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar docente");
            System.out.println("3. Registrar recurso");
            System.out.println("4. Registrar préstamo");
            System.out.println("5. Registrar devolución");
            System.out.println("6. Mostrar usuarios");
            System.out.println("7. Mostrar recursos");
            System.out.println("8. Mostrar préstamos");
            System.out.println("9. Guardar información");
            System.out.println("0. Salir");
            System.out.println("===============================================");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n===== REGISTRAR ESTUDIANTE =====");

                    System.out.print("ID: ");
                    int idEst = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombreEst = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correoEst = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefonoEst = scanner.nextLine();

                    System.out.print("Matrícula: ");
                    String matriculaEst = scanner.nextLine();

                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(
                            idEst,
                            nombreEst,
                            correoEst,
                            telefonoEst,
                            matriculaEst,
                            carrera);

                    inventario.agregarUsuario(estudiante);

                    System.out.println("\nEstudiante registrado correctamente.");

                    break;

                case 2:

                    System.out.println("\n===== REGISTRAR DOCENTE =====");

                    System.out.print("ID: ");
                    int idDoc = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombreDoc = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correoDoc = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefonoDoc = scanner.nextLine();

                    System.out.print("Matrícula: ");
                    String matriculaDoc = scanner.nextLine();

                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();

                    Docente docente = new Docente(
                            idDoc,
                            nombreDoc,
                            correoDoc,
                            telefonoDoc,
                            matriculaDoc,
                            departamento);

                    inventario.agregarUsuario(docente);

                    System.out.println("\nDocente registrado correctamente.");

                    break;

                case 3:

                    System.out.println("\n===== REGISTRAR RECURSO =====");

                    System.out.println("1. Laptop");
                    System.out.println("2. Proyector");
                    System.out.println("3. Kit de Electrónica");

                    System.out.print("Seleccione el tipo: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("ID del recurso: ");
                    int idRecurso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombreRecurso = scanner.nextLine();
                    if (tipo == 1) {

                        System.out.print("Procesador: ");
                        String procesador = scanner.nextLine();

                        Laptop laptop = new Laptop(
                                idRecurso,
                                nombreRecurso,
                                true,
                                procesador);

                        inventario.agregarRecurso(laptop);

                    } else if (tipo == 2) {

                        System.out.print("Luminosidad: ");
                        int luminosidad = scanner.nextInt();
                        scanner.nextLine();

                        Proyector proyector = new Proyector(
                                idRecurso,
                                nombreRecurso,
                                true,
                                luminosidad);

                        inventario.agregarRecurso(proyector);

                    } else if (tipo == 3) {

                        System.out.print("Número de componentes: ");
                        int componentes = scanner.nextInt();
                        scanner.nextLine();

                        KitElectronica kit = new KitElectronica(
                                idRecurso,
                                nombreRecurso,
                                true,
                                componentes);

                        inventario.agregarRecurso(kit);

                    } else {

                        System.out.println("Tipo de recurso no válido.");

                    }

                    System.out.println("\nRecurso registrado correctamente.");

                    break;

                case 4:

                    System.out.println("\n===== REGISTRAR PRÉSTAMO =====");

                    System.out.print("Ingrese el ID del usuario: ");
                    int idUsuarioPrestamo = scanner.nextInt();

                    System.out.print("Ingrese el ID del recurso: ");
                    int idRecursoPrestamo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el ID del préstamo: ");
                    int idPrestamo = scanner.nextInt();
                    scanner.nextLine();

                    inventario.registrarPrestamo(
                            idUsuarioPrestamo,
                            idRecursoPrestamo,
                            idPrestamo);

                    break;

                case 5:

                    System.out.println("\n===== REGISTRAR DEVOLUCIÓN =====");

                    System.out.print("Ingrese el ID del recurso: ");
                    int idRecursoDevolucion = scanner.nextInt();
                    scanner.nextLine();

                    inventario.registrarDevolucion(idRecursoDevolucion);

                    break;

                case 6:

                    System.out.println("\n===== LISTA DE USUARIOS =====");

                    inventario.mostrarUsuarios();

                    break;

                case 7:

                    System.out.println("\n===== LISTA DE RECURSOS =====");

                    inventario.mostrarRecursos();

                    break;
                case 8:

                    System.out.println("\n===== LISTA DE PRÉSTAMOS =====");

                    inventario.mostrarPrestamos();

                    break;

                case 9:

                    System.out.println("\n===== GUARDAR INFORMACIÓN =====");

                    archivoManager.guardar(
                            "Información del Laboratorio Halcón guardada correctamente."
                    );

                    System.out.println("Archivo generado correctamente.");

                    break;

                case 0:

                    System.out.println("\nGracias por utilizar el Sistema de Gestión del Laboratorio Halcón.");
                    System.out.println("Hasta pronto.");

                    break;

                default:

                    System.out.println("\nOpción no válida. Intente nuevamente.");

                    break;

            }

        } while (opcion != 0);

        scanner.close();

    }

}