

package lab2_angelt;


public class Casos {
    
    String lugar_caso,descri_caso, detective;
    int estado;

    public Casos() {
    }
    
    public Casos(String lugar, String descri_caso, String detective, int estado){
        this.lugar_caso=lugar_caso;
        this.descri_caso=descri_caso;
        this.detective=detective;
        this.estado=estado;
    }

    public String getLugar_caso() {
        return lugar_caso;
    }

    public void setLugar_caso(String lugar_caso) {
        this.lugar_caso = lugar_caso;
    }

    public String getDescri_caso() {
        return descri_caso;
    }

    public void setDescri_caso(String descri_caso) {
        this.descri_caso = descri_caso;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Casos{" + "lugar_caso=" + lugar_caso + ", descri_caso=" + descri_caso + ", detective=" + detective + ", estado=" + estado + '}';
    }
    
    
    
}
