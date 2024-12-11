
import java.time.LocalDate;

public class Empresa {

    private String nombre_empresa;
    private String cif;
    private LocalDate fecha_fundacion;
    private int maximo_de_trabajadores = 0;
    private Trabajador[] trabajadores;
    private int trabajadoresActuales = 0;

    public Empresa(String nombre_empresa, String cif, LocalDate fecha_fundacion, int maximo_de_trabajadores,
            Trabajador[] trabajadores) {
        this.nombre_empresa = nombre_empresa;
        this.cif = cif;
        this.fecha_fundacion = LocalDate.now();
        this.maximo_de_trabajadores = maximo_de_trabajadores;
        this.trabajadores = new Trabajador[maximo_de_trabajadores];
    }

    public String getNombre_empresa() {
        return this.nombre_empresa;
    }

    public String getCif() {
        return this.cif;
    }

    public LocalDate getFecha_fundacion() {
        return this.fecha_fundacion;
    }

    public int getNumero_de_trabajadores() {
        return this.maximo_de_trabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return this.trabajadores;
    }

    public int getTrabajadoresActuales() {
        return this.trabajadoresActuales;
    }

    public boolean registrarPersona(Trabajador t) {

        if (trabajadoresActuales < trabajadores.length) {
            trabajadores[trabajadoresActuales] = t;
            trabajadoresActuales++;
            System.out.println("Trabajador " + t.getNombre() + " ha sido registrado");
            return true;

        }
        return false;
    }

    public boolean eliminarPersona(Trabajador t) {

        for (int i = 0; i < trabajadoresActuales; i++) {
            if (trabajadores[i].equals(t)) {
                trabajadores[i] = null;
                trabajadoresActuales--;
                System.out.println("Trabajador " + t.getNombre() + " ha sido eliminado");
                return true;
            }
        }
        System.out.println("Cliente no encontrado");
        return false;
    }

    public boolean eliminarTrabajadorEmpresa(Trabajador t) {

        if (t != null && !t.getAsignado()) {
            t.setAsignado(false);
            System.out.println("Trabajador " + t.getNombre() + " fui eliminado a empresa");
            return true;
        }
        return false;
    }

    public boolean registrarTrabajadorEmpresa(Trabajador t) {

        if (t != null && !t.getAsignado()) {
            t.setAsignado(true);
            System.out.println("Trabajador " + t.getNombre() + " fui asignado a empresa");
            return true;
        }

        return false;
    }

    public String mostrarInformacionEmpresa() {
        return String.format("Empresa - Nombre: %s, CIF: %s, Fecha fundacion: %s, Numero de trabajadores maximo: %s", this.nombre_empresa, this.cif, this.fecha_fundacion, this.maximo_de_trabajadores);
    }

    public String mostrarInformacionTrabajadores() {
        return String.format("Trabjadores registrados: %s /n", this.trabajadores);
    }

}
