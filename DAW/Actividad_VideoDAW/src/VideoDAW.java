
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VideoDAW {

    private static int contador = 0;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private String cif;
    private String direccion;
    private LocalDate fechaAlta;

    private Pelicula[] peliculas;
    private Cliente[] clientes;
    private int nElementosActuales;

    public VideoDAW(String cif, String direccion, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = LocalDate.now();
        this.peliculas = new Pelicula[100];
        this.clientes = new Cliente[100];
        this.nElementosActuales = 0;
    }

    public String getCif() {
        return this.cif;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public String mostrarInfoVideoClub() {
        return String.format("CIF: %s, Direccion: %s, Fecha Alta: %s",
                this.cif, this.direccion, this.fechaAlta);
    }

    public String mostrarPeliculasRegistradas() {
        return String.format("Peliculas Registrados: %s", this.peliculas);
    }

    public String mostrarClientesRegistrados() {
        return String.format("Clientes Registrados: %s", this.clientes);
    }

    public void alquilarPelicula(Cliente cliente, Pelicula pelicula) {
        if (pelicula.esDiscponible()) {
            pelicula.alquiler();
            System.out.println("Cliente " + cliente.getNombre() + " alquilo la pelicula " + pelicula.getTitulo());
        }else{
            System.out.println(" Pelicula " + pelicula.getTitulo() + " no es disponible");
        }
    }

}
