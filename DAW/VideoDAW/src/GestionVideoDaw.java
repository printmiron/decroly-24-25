import java.util.Scanner;

public class GestionVideoDAW {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        
        String opcion = null;
        do {
           System.out.println("1. Datos de la cuenta");
           System.out.println("2. IBAN");
           System.out.println("3. Titular");
           System.out.println("4. Saldo");
           System.out.println("5. Ingreso");
           System.out.println("6. Retirada");
           System.out.println("7. Movimientos");
           System.out.println("8. Salir");
           switch (sc.nextLine()) {
              case "1":
                 
                 break;
              case "2":
                 
                 break;
              case "3":
                 
                 break;
              case "4":
                 
                 break;
              case "5":
               
              case "6":

                 break;
              case "7":
              
                 break;
              case "8":
                 System.out.println("Hasta luego!");
                 break;
              default:
                 System.out.println("Opcion no valida, intenta de nuevo.");
           }
        } while(!"8".equals(opcion));

    }
}
