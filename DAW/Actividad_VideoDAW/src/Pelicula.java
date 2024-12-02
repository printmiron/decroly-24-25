
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

    private static int contador = 0;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private int id;
    private String titulo;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean esAlquilada;
    private boolean disponible;

    public Pelicula(String id, String titulo, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean alquilada) {
        this.id = ++contador;
        this.titulo = titulo;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = LocalDate.now();
        this.fechaAlquiler = LocalDateTime.now();
        this.esAlquilada = false;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

//ENUM
    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public boolean getAlquilada() {
        return this.esAlquilada;
    }

    public String mostrarInfoPelicula() {
        return String.format("ID: %s, Titulo: %s, Fecha Registro: %s, Fecha Baja: %s, Fecha Aqulier: %s, Alquilada: %s",
                this.id, this.titulo, this.fechaRegistro, this.fechaBaja, this.fechaAlquiler, this.esAlquilada);
    }

}
