
public class CuentaBancaria {

    private String iban;
    private String titular;
    private int saldo;
    private Movimiento[] movimientos;
    private int nElementosActuales;

    public CuentaBancaria(String iban, String titular, int saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
    }

    public String getIBAN() {
        return this.iban;
    }

    public void setIBAN() {
        String iban = "^ES[0-9]{22}$";
    }

    public String getTitular() {
        return this.titular;
    }

    public int getSaldo() {
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

    public String infoCuentaBancaria(){
       String info = String.format("Datos de la cuenta - IBAN: %s, Titular: %s, Saldo: %s", this.iban, this.titular, this.saldo);
        
        return info;
    }

}
