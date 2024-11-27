
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private static int contador = 0;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private String dni;
    private String nombre;
    private int nsocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;

    private Pelicula [] peliculas;
    private int nElementosActuales;

    public Cliente (String dni, String nombre, int nsocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBaja){
        this.dni = dni;
        this.nombre = nombre;
        this.nsocio = ++contador;
        this.direccion = direccion;
        this.fechaNacimiento = LocalDate.now();
        this.fechaBaja = LocalDate.now();
        this.peliculas = new Pelicula[100];
        this.nElementosActuales = 0;
    }

    public String getDni(){
        return this.dni;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNsocio(){
        return this.nsocio;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public LocalDate getFechaBaja(){
        return this.fechaBaja;
    }


    public String mostrarInfoCliente() {
        return String.format("DNI: %s, Nombre: %s, Numero de socio: %s, Direccion: %s, Fecha Nacimiento: %s, Fecha Baja: %s", 
        this.dni, this.nombre, this.nsocio, this.direccion, this.fechaNacimiento, this.fechaBaja);
    }
    
    public String mostrarPeliculasAlquiladas() {
        return String.format("Peliculas Alquiladas: ", this.peliculas);
    }

}