public class CuentaBancaria {

    private String IBAN;
    private String Titular;
    private int Saldo;
    private int Movimiento;

    public CuentaBancaria (String  IBAN, String Titular, int Saldo, int Movimiento){
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.Saldo = 0;
        this.Movimiento = 0;
    }

    public String getIBAN(){
        return this.IBAN;
    }

    public void setIBAN(){
        
    }

    public String getTitular(){
        return this.Titular;
    }

    public int getSaldo(){
        return this.Saldo;
    }

    public void setSaldo(){
    
    }

    public int getMovimiento(){
        return this.Movimiento;
    }

    public boolean IngresarDinero (Movimiento M1){
        boolean isAdd = false;
        if (M1 != null) {
            
            
        }
    }
}
