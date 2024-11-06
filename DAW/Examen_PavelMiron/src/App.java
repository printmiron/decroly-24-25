
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Me pide numeros totales que voy a tener al inicar la programa
        //Cuando insertamos el numero el array toma el valor como su tamaño
        System.out.println("Escribe la cantidad total de numeros al almacenar: ");
        int numTotal = sc.nextInt();

        int array[] = new int[numTotal];

        int opcionMenu = 0;
        int opcionModificar = 0;
        int opcionEstadisticas = 0;
        int opcionAmpliar = 0;

        //Creo un menu donde tengo los 4 primeros puntos "opcionMenu"
        //Y dos submenu "opcionModificar" y "opcionEstadisticas"
        do {

            System.out.println("1. Modificar coleccion");
            System.out.println("2. Estadisticas de la coleccion");
            System.out.println("3. Ampliar el valor de la coleccion");
            System.out.println("4. Salir");

            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                
                //Modificar Coleccion
                case 1:

                    System.out.println("1. Insertar numero");
                    System.out.println("2. Borrar numero de una posicion especifica");
                    System.out.println("3. Modificar numero de una posicion especifica");

                    opcionModificar = sc.nextInt();

                    switch (opcionModificar) {

                        //Creo un for donde guardo los numeros en un array
                        case 1:

                            for (int i = 0; i < array.length; i++) {
                                array[i] = sc.nextInt();

                            }

                            break;

                        case 2:
                            //
                            break;

                        case 3:
                            //
                            break;
                        default:
                    }

                    break;

                //Estadisticas de la coleccion
                case 2:

                    System.out.println("1. Media de todos los valores no nulos");
                    System.out.println("2. Suma de todos los valores ");
                    System.out.println("3. Maximo de coleccion");
                    System.out.println("4. Minimo de coleccion");

                    opcionEstadisticas = sc.nextInt();

                    switch (opcionEstadisticas) {
                        //Media de todos los valores no nulos
                        case 1:

                            int sumaMedia = 0;

                            for (int i = 0; i < array.length; i++) {
                                sumaMedia += array[i];
                            }

                            int media = sumaMedia / array.length;

                            System.out.println("La media de los valores es : " + media);

                            break;

                        //Suma de todos los valores
                        case 2:

                            int sumaTotal = 0;

                            for (int i = 0; i < array.length; i++) {
                                sumaTotal += array[i];
                            }

                            System.out.println("La suma de todos los valores es: " + sumaTotal);

                            break;

                        //Maximo de coleccion
                        case 3:

                            int max = array[0];

                            for (int i = 0; i < array.length; i++) {

                                if (array[i] > max) {
                                    max = array[i];
                                }

                            }

                            System.out.println("El numero maximo es: " + max);

                            break;

                        //Minimo de coleccion
                        case 4:

                            int min = array[0];

                            for (int i = 0; i < array.length; i++) {

                                if (array[i] < min) {
                                    min = array[i];
                                }

                            }

                            System.out.println("El numero minimo es: " + min);

                            break;

                        default:
                    }

                    break;

                //Ampliar el valor de la coleccion
                case 3:

                    int ampliarValor = sc.nextInt();

                    for (int i = 0; i < numTotal; i++) {
                        ampliarValor = numTotal;
                    }

                    break;

                //Salir
                case 4:

                    System.out.println("Salir de programa");

                    break;

                default:
                    System.err.println("Opcion no valida!");

            }

        } while (opcionMenu != 4);

    }
}

//Resumen, tengo en vez de insertar un numero tengo que poner todos a la vez y sin hecho el 
//"borrar numero" y "modificar numero", y al ampliar tambien tengo dificuldades, el menu va bien.
