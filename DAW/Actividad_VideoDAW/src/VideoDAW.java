
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
    private int PeliculasActuales;
    private int ClientesActuales;

    public VideoDAW(String cif, String direccion, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = LocalDate.now();
        this.peliculas = new Pelicula[100];
        this.clientes = new Cliente[100];
        this.PeliculasActuales = 0;
        this.ClientesActuales = 0;
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

    public boolean alquilarPelicula(Pelicula p) {
        boolean isAddP = false;
        if (p != null) {
            this.peliculas[PeliculasActuales] = p;
            this.PeliculasActuales++;
            isAddP = true;
        }
        return isAddP;
    }

    public boolean devolverPelicula(Pelicula p) {
        boolean isRemoveP = false;
        if (p != null) {
            this.peliculas[PeliculasActuales] = p;
            this.PeliculasActuales--;
            isRemoveP = true;
        }
        return isRemoveP;
    }

    public boolean darBajaCliente(Cliente c) {
        boolean isRemoveC = false;
        if (c != null) {
            this.clientes[ClientesActuales] = c;
            this.ClientesActuales++;
            isRemoveC = true;
        }
        return isRemoveC;
    }

    public boolean registarCliente(Cliente c) {
        boolean isAddC = false;
        if (c != null) {
            this.clientes[ClientesActuales] = c;
            this.ClientesActuales--;
            isAddC = true;

        }
        return isAddC;
    }

}
