
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Pida el nombre y IBAN
        System.out.println("Nombre del titular: ");
        String titular = sc.nextLine();

        System.out.println("Introduce su IBAN: ");
        String iban = sc.nextLine();

        //Contructor
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular, 0);
        Movimiento mov = new Movimiento(0, titular, iban, 0);
        
        

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
                        System.out.println("Cuanto dinero quieres ingresar?" + cuenta.infoSaldo());
                        double ingresoD = sc.nextDouble();

    
                        

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
