
import java.util.Scanner;

public class Gestion {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre de empresa:");
        String nombre_empresa = sc.nextLine();

        final String patronCIF = "[A-Z][0-9]{8}";
        String cif = Utils.comprobarPatronRepetidamente(patronCIF, "Introduce su CIF: Ejemplo (A12345678)");

        System.out.println("Introduce numero maximo de trabajadores:");
        int maximo_de_trabajadores = sc.nextInt();

        Empresa empresa = new Empresa(nombre_empresa, cif, null, maximo_de_trabajadores, null);

        String opcion;
        // Menu
        do {
            System.out.println("1. Crear Persona");
            System.out.println("2. Registrar trabajador en empresa");
            System.out.println("3. Mostrar informacion general de la empresa");
            System.out.println("4. Monstrar el numero de trabajadores actuales");
            System.out.println("5. Mostrar informacion de todos los trabadores ");
            System.out.println("6. Eliminar trabajador de la empresa");
            System.out.println("7. Eliminar persona de la programa ");
            System.out.println("8. Salir de la aplicacion");
            opcion = sc.nextLine();

            switch (opcion) {
                //Crear persona
                case "1":

                    final String patronNombre = "[A-Z][a-z]+ [A-Z][a-z]+"; // Al menos Nombre y Apellido
                    String nombre = Utils.comprobarPatronRepetidamente(patronNombre, "Introduce su Nombre y Apellido: (Ejemplo: Pavel Miron)");

                    System.out.println("Introduce la fecha de nacimiento: ");
                    String fecha_nacimiento = sc.nextLine();

                    final String patronDNI = "[A-Z][0-9]{7}[A-Z]";
                    String dni = Utils.comprobarPatronRepetidamente(patronDNI, "Introduce su DNI: Ejemplo (Y1234567K)");

                    System.out.println("Introduce la direccion: ");
                    String direccion = sc.nextLine();

                    Trabajador regPersona = new Trabajador(nombre, null, dni, direccion, 0);

                    empresa.registrarPersona(regPersona);
                    System.out.println("Persona registrada correctamente.");

                    break;
                //Registrar trabjador
                case "2":

                    System.out.println("Introduce el DNI del trabajador que quieres registar:");
                    String trabajadorRegistar = sc.nextLine();

                    // Buscar el trabajador por DNI
                    Trabajador registarTrabajador = null;
                    for (Trabajador t : empresa.getTrabajadores()) {
                        if (t != null && t.getDni().equalsIgnoreCase(trabajadorRegistar)) {
                            registarTrabajador = t;
                            break;
                        }
                    }
                    if (registarTrabajador == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }
                    // Registrar si se encuantra el trabajador
                    if (registarTrabajador != null) {
                        boolean registrar = empresa.registrarTrabajadorEmpresa(registarTrabajador);
                        if (registrar) {
                            System.out.println("Trabajador registrado!");
                        } else {
                            System.out.println("No se pudo registrar el trabajador verifica si esta disponible");
                        }
                    }

                    break;
                //Mostrar informacion general de la empresa
                case "3":

                    System.out.println(empresa.mostrarInformacionEmpresa());

                    break;
                //Mostrar el numero de trabajadores actuales
                case "4":
                    //
                    System.out.println(empresa.getTrabajadoresActuales());

                    break;
                //Mostrar informacion de todos los trabajadores
                case "5":

                    Trabajador[] trabajadores = empresa.getTrabajadores();
                    System.out.println("Trabajadores registrados en la empresa:");
                    boolean hayTrabajadores = false;

                    for (Trabajador trabajador : trabajadores) {
                        if (trabajador != null) {
                            hayTrabajadores = true;
                            System.out.println(trabajador.mostrarInformacionTrabajador());
                            System.out.println(" ");
                        }
                    }

                    if (!hayTrabajadores) {
                        System.out.println("No hay clientes registrados.");
                    }

                    break;
                //Eliminar trabajador de la empresa
                //no me va la eliminacion de la empresa y no puedo encontrar el error
                case "6":

                    System.out.println("Introduce el DNI del trabajador que quieres eliminar:");
                    String trabajadorEliminarEmpresa = sc.nextLine();

                    // Buscar el trabajador por DNI
                    Trabajador eliminarTrabajadorEmpresa = null;
                    for (Trabajador t : empresa.getTrabajadores()) {
                        if (t != null && t.getDni().equalsIgnoreCase(trabajadorEliminarEmpresa)) {
                            eliminarTrabajadorEmpresa = t;
                            break;
                        }
                    }
                    if (eliminarTrabajadorEmpresa == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }
                    // Eliminar si se encuantra el trabajador
                    if (eliminarTrabajadorEmpresa != null) {
                        boolean eliminar = empresa.eliminarTrabajadorEmpresa(eliminarTrabajadorEmpresa);
                        if (eliminar) {
                            System.out.println("Trabajador eliminado!");
                        } else {
                            System.out.println("No se pudo eliminar el trabajador verifica si esta disponible");
                        }
                    }

                    break;
                //Eliminar persona del programa.
                case "7":

                    System.out.println("Introduce el dni del trabajador para eliminar:");
                    String trabajadorEliminar = sc.nextLine();

                    // Buscar trabajador por DNI
                    Trabajador eliminarPersona = null;
                    for (Trabajador t : empresa.getTrabajadores()) {
                        if (t != null || t.getDni().equalsIgnoreCase(trabajadorEliminar)) {
                            eliminarPersona = t;
                            break;
                        }
                    }

                    if (trabajadorEliminar == null) {
                        System.out.println("Trabajador no encontrado");
                        break;
                    }

                    // eliminar trabajador
                    if (eliminarPersona != null) {
                        boolean eliminar = empresa.eliminarPersona(eliminarPersona);
                        if (eliminar) {
                            System.out.println("Trabajador eliminado");
                        } else {
                            System.out.println("No se pudo eliminar el trabajador");
                        }
                    } else {
                        System.out.println("Trabajador no encontrado");
                    }

                    break;
                case "8":

                    System.out.println("Hasta luego");

                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (!"8".equals(opcion));

        sc.close();
    }
}
