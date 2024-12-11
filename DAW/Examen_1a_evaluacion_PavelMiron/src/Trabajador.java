
import java.time.LocalDate;

public class Trabajador {

    private static int contador = 0;

    private String nombre;
    private LocalDate fecha_nacimiento;
    private String dni;
    private String direccion;
    private int numeroSS;
    private boolean esAsignado; //me reciero si esta asignado a empresa o no

    public Trabajador(String nombre, LocalDate fecha_nacimiento, String dni, String direccion, int numeroSS) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroSS = ++contador;
        this.esAsignado = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public String getDni() {
        return this.dni;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroSS() {
        return this.numeroSS;
    }

    public boolean getAsignado() {
        return this.esAsignado;
    }

    public void setAsignado(boolean asignado) {
        this.esAsignado = asignado;
    }

    public String mostrarInformacionTrabajador() {
        return String.format("Trabajador - Nombre: %s, Fecha de nacimiento: %s, DNI: %s, Direccion: %s, NumeroSS", this.nombre, this.fecha_nacimiento, this.dni, this.direccion, this.numeroSS);
    }

}
