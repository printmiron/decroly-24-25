
public class Astros {

    private double radio_ecuatorial;
    private double rotacion_sobre_su_eje;
    private double temperatura_media;
    private double gravedad;

    public Astros(double radio_ecuatorial, double rotacion_sobre_su_eje, double temperatura_media, double gravedad) {
        this.radio_ecuatorial = radio_ecuatorial;
        this.rotacion_sobre_su_eje = rotacion_sobre_su_eje;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
    }

    public void mostrarAstros(){
        System.out.println("Radio ecuatorial: " + this.radio_ecuatorial);
        System.out.println("Rotacion sobre su eje: " + this.radio_ecuatorial);
        System.out.println("Temperatura media: " + this.temperatura_media);
        System.out.println("Gravedad: " + this.gravedad);
    }

    public double getRadio_ecuatorial() {
        return this.radio_ecuatorial;
    }

    public double getRotacion_sobre_su_eje() {
        return this.rotacion_sobre_su_eje;
    }

    public double getTemperatura_media() {
        return this.temperatura_media;
    }

    public double getGravedad() {
        return this.gravedad;
    }

}
