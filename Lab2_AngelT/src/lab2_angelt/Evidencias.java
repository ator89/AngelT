package lab2_angelt;

public class Evidencias {

    private int nivel;
    private String nombre, descri;

    public Evidencias() {
    }

    public Evidencias(String nombre, String descri, int nivel) {
        this.nombre = nombre;
        this.descri = descri;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    @Override
    public String toString() {
        return "Evidencias{" + "nivel=" + nivel + ", nombre=" + nombre + ", descri=" + descri + '}';
    }

}
