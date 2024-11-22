
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private static int contador = 0;

    private DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("dd-MM-yyyy HH:mm:ss");

    //Atributos
    private int id;
    private LocalDateTime fechaMovimiento;
    private String tipo;
    private double cantidad;

    //Contrustor(s)
    public Movimiento(String tipo, int cantidad) {
        this.id = this.contador;
        this.fechaMovimiento = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void ModificarFecha(String fechaModificada) {

        this.fechaMovimiento = LocalDateTime.parse(fechaModificada, formatter);
    }

    public LocalDateTime getFechaMovimiento() {
        return this.fechaMovimiento;
    }

    public int getId() {
        return this.id;
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
                this.id, this.fechaMovimiento, this.tipo, this.cantidad);

        return info;
    }

}
