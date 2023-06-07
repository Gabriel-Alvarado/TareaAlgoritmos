public class Tratamiento {
    String IdTratamiento;
    String nombre;
    int precio;

    public Tratamiento(String IdTratamiento, String nombre, int precio) {
        this.IdTratamiento = IdTratamiento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setIdTratamiento(String IdTratamiento) {
        this.IdTratamiento = IdTratamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIdTratamiento() {
        return IdTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String toString() {
        return "Tratamiento: " + "\n\nidTratamiento=" + IdTratamiento + "\nNombre=" + nombre + "\nPrecio=" + precio + "\n";
    }

    public String toString2() {
        return "Tratamiento: " + "\n\nidTratamiento=" + IdTratamiento + "\nNombre=" + nombre + "\n";
    }
    
}
