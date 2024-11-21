
import java.time.LocalDateTime;


public class Movimiento {

    private static int contador = 0;
    

    //Atributos
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    //Contrustor(s)
    public Movimiento(String tipo, int cantidad) {
        this.id = this.contador;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return this.id;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    //Interpolacion
    public String mostrarInfoMovimiento() {

        String info = String.format("Movimiento - ID: %s, Fecha: %s, Tipo: %s, Cantidad: %s",
                this.id, this.fecha, this.tipo, this.cantidad);

        return info;
    }

}
