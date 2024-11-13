public class CuentaBancaria {

    private String iban;
    private String titular;
    private int saldo;
    private Movimiento [] movimientos;
    private int nElementosActuales;

    public CuentaBancaria (String  iban, String titular, int saldo, int movimientos){
        this.iban = "ES6621000418401234567891";
        this.titular = titular;
        this.saldo = 0;
    }

    public String getIBAN(){
        return this.iban;
    }

    public void setIBAN(){
        String iban = "^ES[0-9]{22}$";
    }

    public String getTitular(){
        return this.titular;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(){
        if (saldo < -50) {
            System.out.println("Saldo no puede ser inferior de -50!");
        }
    }

    public boolean ingresarDinero(Movimiento m1){
        boolean isAdd = false;
        if (m1 != null) {
            this.movimientos[nElementosActuales] = m1;
            this.nElementosActuales++;
            isAdd = true;
        }
        return isAdd;
    }

   

}


