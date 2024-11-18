
import java.time.LocalDate;


public class Movimiento {

    //Atributos
    int id;
    String fecha;
    String tipo;
    double cantidad;

    //Contrustor(s)
    public Movimiento(int id, String fecha, String tipo, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return this.id;
    }

    public String getFecha() {
        LocalDate.now();
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
