//Modificar Aquiler peli devolver y reg cliente y baja cliente

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VideoDAW {

    private static int contador = 0;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private String nombre;
    private String cif;
    private String direccionCV;
    private LocalDate fechaAlta;

    private Pelicula[] peliculas;
    private Cliente[] clientes;
    private int PeliculasActuales;
    private int ClientesActuales;

    public VideoDAW( String cif, String direccionVC) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccionCV = direccionCV;
        this.fechaAlta = LocalDate.now();
        this.peliculas = new Pelicula[100];
        this.clientes = new Cliente[100];
        this.PeliculasActuales = 0;
        this.ClientesActuales = 0;
    }

    public String getCif() {
        return this.cif;
    }

    public String getDireccionCV() {
        return this.direccionCV;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public String mostrarInfoVideoClub() {
        return String.format("CIF: %s, Direccion: %s, Fecha Alta: %s",
                this.cif, this.direccionCV, this.fechaAlta);
    }

    public String mostrarPeliculasRegistradas() {
        return String.format("Peliculas Registrados: %s /n", this.peliculas);
    }

    public String mostrarClientesRegistrados() {
        
        return String.format("Clientes Registrados: %s /n", this.clientes);
    }

    public boolean alquilarPelicula(Pelicula p) {
        if (p != null && !p.getAlquilada()) {
            this.peliculas[PeliculasActuales] = p;
            this.PeliculasActuales++;
            p.setAlquilada(true);
            return true;
        }
        return false;
    }

    public boolean devolverPelicula(Pelicula p) {
        if (p != null && !p.getAlquilada()) {
            this.peliculas[PeliculasActuales] = p;
            this.PeliculasActuales--;
            p.setAlquilada(false);
            return true;
        }
        return false;
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
