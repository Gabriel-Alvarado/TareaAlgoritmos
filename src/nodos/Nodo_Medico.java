package nodos;

public class Nodo_Medico {
    private String id_Medico;
    private String nombre_Medico;

    public Nodo_Medico(String id_Medico, String nombre_Medico) {
        this.id_Medico = id_Medico;
        this.nombre_Medico = nombre_Medico;
    }

    public Nodo_Medico() {
        id_Medico = "";
        nombre_Medico = "";
    }

    public String getId_Medico() {
        return id_Medico;
    }

    public void setId_Medico(String id_Medico) {
        this.id_Medico = id_Medico;
    }

    public String getNombre_Medico() {
        return nombre_Medico;
    }

    public void setNombre_Medico(String nombre_Medico) {
        this.nombre_Medico = nombre_Medico;
    }
}
