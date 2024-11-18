
public class CuentaBancaria {

    //Atributos
    private String iban;
    private String titular;
    private double saldo;

    //Movimientos de ingreso o retirado
    private Movimiento[] movimientos;
    private int nElementosActuales;

    //Contrustor(s)
    public CuentaBancaria(String iban, String titular, double saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
    }

    public String getIBAN() {
        return this.iban;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean ingresarDinero(Movimiento m1) {
        boolean isAdd = false;
        if (m1 != null) {
            this.movimientos[nElementosActuales] = m1;
            this.nElementosActuales++;
            isAdd = true;
        }
        return isAdd;
    }

    public boolean retirarDinero(Movimiento m1) {
        boolean isRemove = false;
        if (m1 != null) {
            if (this.saldo - m1.getCantidad() < 0) {
                System.out.println("Aviso! La cantidad es 0");
            }
            if (this.saldo - m1.getCantidad() < -50) {
                System.out.println("La cantidad no puede ser inferior de -50");
            } else {
                this.movimientos[nElementosActuales] = m1;
                this.nElementosActuales++;
                isRemove = true;
            }
        }

        return isRemove;
    }

    //Interpolacion
    public String infoCuentaBancaria(){
       String info = String.format("Datos de la cuenta - IBAN: %s, Titular: %s, Saldo: %s", this.iban, this.titular, this.saldo);
        
        return info;
    }

    public String infoSaldo(){
        String info = String.format("Saldo: %s", this.saldo);
         
         return info;
     }

}
