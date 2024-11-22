
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);



        //Pida el nombre y IBAN
        final String patronTitular = "[A-Z]{7,8}[A-Za-z]";
        String titular = Utils.comprobarPatronRepetidamente(patronTitular, "Introduce su Nombre y Apellido: ");


        final String pantronIBAN = "[A-Z]{2}[0-9]{22}";
        String iban = Utils.comprobarPatronRepetidamente(pantronIBAN, "Introduce su IBAN: ");

        //Contructor
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular, 0);
        Movimiento mov = new Movimiento(iban, cantidad);

        String opcion;

        //Menu
        do {

            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println(cuenta.infoCuentaBancaria());
                    break;
                case "2":
                    System.out.println("IBAN: " + iban);
                    break;

                case "3":
                    System.out.println("Titular: " + titular);
                    break;

                case "4":
                    System.out.println(cuenta.infoSaldo());
                    break;

                case "5":
                    System.out.println("Cuantos dinero quieres ingresar?");
                    double ingresoD = sc.nextDouble();

                    Movimiento m1 = new Movimiento("Ingresar", ingresoD);
                    cuenta.ingresoD(m1);

                    break;

                case "6":

                    break;

                case "7":
                    System.out.println(mov.mostrarInfoMovimiento() + " ");
                    break;

                case "8":
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");

            }
        } while (!"8".equals(opcion));

    }
}
