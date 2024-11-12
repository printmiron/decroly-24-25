import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Solicita la cantidad total de números a almacenar
        System.out.println("Escribe la cantidad total de números a almacenar: ");
        int numTotal = sc.nextInt();

        int array[] = new int[numTotal];

        int opcionMenu = 0;
        int opcionModificar = 0;
        int opcionEstadisticas = 0;
        int opcionAmpliar = 0;

        // Bucle principal del programa con las opciones del menú
        do {
            System.out.println("\n1. Modificar colección");
            System.out.println("2. Estadísticas de la colección");
            System.out.println("3. Ampliar el valor de la colección");
            System.out.println("4. Salir");

            opcionMenu = sc.nextInt();

            switch (opcionMenu) {

                // Modificar colección
                case 1:
                    System.out.println("\n1. Insertar número");
                    System.out.println("2. Borrar número de una posición específica");
                    System.out.println("3. Modificar número de una posición específica");

                    opcionModificar = sc.nextInt();

                    switch (opcionModificar) {

                        // Insertar número: aquí pedimos los números y los insertamos en el array
                        case 1:
                            System.out.println("Ingresa los " + numTotal + " números:");
                            for (int i = 0; i < array.length; i++) {
                                array[i] = sc.nextInt();
                            }
                            break;

                        // Borrar número: elimina el número de una posición específica
                        case 2:
                            System.out.println("Ingresa la posición del número a borrar (0 - " + (array.length - 1) + "):");
                            int borrarPos = sc.nextInt();
                            if (borrarPos >= 0 && borrarPos < array.length) {
                                array[borrarPos] = 0; // Asigna 0 a esa posición para "borrar"
                                System.out.println("Número en la posición " + borrarPos + " borrado.");
                            } else {
                                System.out.println("Posición no válida.");
                            }
                            break;

                        // Modificar número: modifica un número en una posición específica
                        case 3:
                            System.out.println("Ingresa la posición del número a modificar (0 - " + (array.length - 1) + "):");
                            int modificarPos = sc.nextInt();
                            if (modificarPos >= 0 && modificarPos < array.length) {
                                System.out.println("Ingresa el nuevo número para la posición " + modificarPos + ":");
                                array[modificarPos] = sc.nextInt();
                                System.out.println("Número modificado.");
                            } else {
                                System.out.println("Posición no válida.");
                            }
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                // Estadísticas de la colección
                case 2:
                    System.out.println("\n1. Media de todos los valores no nulos");
                    System.out.println("2. Suma de todos los valores");
                    System.out.println("3. Máximo de colección");
                    System.out.println("4. Mínimo de colección");

                    opcionEstadisticas = sc.nextInt();

                    switch (opcionEstadisticas) {
                        // Media de todos los valores no nulos
                        case 1:
                            int sumaMedia = 0;
                            int contador = 0;
                            for (int i = 0; i < array.length; i++) {
                                if (array[i] != 0) { // Solo contamos los valores no nulos
                                    sumaMedia += array[i];
                                    contador++;
                                }
                            }
                            if (contador > 0) {
                                int media = sumaMedia / contador;
                                System.out.println("La media de los valores no nulos es: " + media);
                            } else {
                                System.out.println("No hay valores no nulos para calcular la media.");
                            }
                            break;

                        // Suma de todos los valores
                        case 2:
                            int sumaTotal = 0;
                            for (int i = 0; i < array.length; i++) {
                                sumaTotal += array[i];
                            }
                            System.out.println("La suma de todos los valores es: " + sumaTotal);
                            break;

                        // Máximo de colección
                        case 3:
                            int max = array[0];
                            for (int i = 1; i < array.length; i++) {
                                if (array[i] > max) {
                                    max = array[i];
                                }
                            }
                            System.out.println("El número máximo es: " + max);
                            break;

                        // Mínimo de colección
                        case 4:
                            int min = array[0];
                            for (int i = 1; i < array.length; i++) {
                                if (array[i] < min) {
                                    min = array[i];
                                }
                            }
                            System.out.println("El número mínimo es: " + min);
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                // Ampliar el valor de la colección
                case 3:
                    System.out.println("Ingresa el número de elementos adicionales para ampliar la colección:");
                    int ampliarValor = sc.nextInt();
                    int[] nuevaColeccion = new int[array.length + ampliarValor];
                    // Copiar los elementos del array original al nuevo array ampliado
                    for (int i = 0; i < array.length; i++) {
                        nuevaColeccion[i] = array[i];
                    }
                    array = nuevaColeccion; // Actualizar la referencia del array
                    System.out.println("Colección ampliada.");
                    break;

                // Salir
                case 4:
                    System.out.println("Salir del programa");
                    break;

                default:
                    System.err.println("Opción no válida!");
            }

        } while (opcionMenu != 4);

        sc.close();
    }
}
