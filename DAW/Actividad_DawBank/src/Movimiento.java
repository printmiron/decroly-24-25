public class Movimiento {

    int id;
    int fecha;
    String tipo;
    int cantidad;

    public Movimiento (int id, int fecha, String tipo, int cantidad){
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId(){
        return this.id;
    }

    public int getFecha(){
        return this.fecha;
    } 

    public String getTipo(){
        return this.tipo;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public String mostrarInfoMovimiento(){

        String info = String.format("Movimiento - ID: %s, Fecha: %s, Tipo: %s, Cantidad: %s", this.id, this.fecha, this.tipo, this.cantidad);

        return info;
    }

}
