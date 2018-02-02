package lab2_angelt;

public class Detectives {

    private String nombre, nacionalidad, user, password;
    private int edad, anios_trabajo;

    public Detectives() {
    }

    public Detectives(
            String nombre, int edad, String nacionalidad,
            int anios_trabajo, String user, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.anios_trabajo = anios_trabajo;
        this.user = user;
        this.password = password;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnios_trabajo() {
        return anios_trabajo;
    }

    public void setAnios_trabajo(int anios_trabajo) {
        this.anios_trabajo = anios_trabajo;
    }

    @Override
    public String toString() {
        return "Detectives{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", user=" + user + ", password=" + password + ", edad=" + edad + ", anios_trabajo=" + anios_trabajo + '}';
    }

}
