package nodos;

public class Nodo_Tratamiento {
    private String id_Tratamiento;
    private String nombre_Tratamiento;
    private double precio_Tratamiento;
    private Nodo_Tratamiento siguiente;

    public Nodo_Tratamiento() {
        id_Tratamiento = "";
        nombre_Tratamiento = "";
        precio_Tratamiento = 0;
        siguiente = null;
    }

    public Nodo_Tratamiento(String id_Tratamiento, String nombre_Tratamiento, double precio_Tratamiento) {
        this.id_Tratamiento = id_Tratamiento;
        this.nombre_Tratamiento = nombre_Tratamiento;
        this.precio_Tratamiento = precio_Tratamiento;
    }

    public String getId_Tratamiento() {
        return id_Tratamiento;
    }

    public void setId_Tratamiento(String id_Tratamiento) {
        this.id_Tratamiento = id_Tratamiento;
    }

    public String getNombre_Tratamiento() {
        return nombre_Tratamiento;
    }

    public void setNombre_Tratamiento(String nombre_Tratamiento) {
        this.nombre_Tratamiento = nombre_Tratamiento;
    }

    public double getPrecio_Tratamiento() {
        return precio_Tratamiento;
    }

    public void setPrecio_Tratamiento(double precio_Tratamiento) {
        this.precio_Tratamiento = precio_Tratamiento;
    }


    public Nodo_Tratamiento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Tratamiento siguiente) {
        this.siguiente = siguiente;
    }
}
