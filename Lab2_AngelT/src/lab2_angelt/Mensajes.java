package lab2_angelt;

public class Mensajes {

    private String emisor, receptor, contenido;
    private int prioridad;

    public Mensajes() {
    }

    public Mensajes(String emisor, String receptor, String contenido, int prioridad) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        this.prioridad = prioridad;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "emisor=" + emisor + ", receptor=" + receptor + ", contenido=" + contenido + ", prioridad=" + prioridad + '}';
    }

}
