package nodos;

public class Nodo_Cita {
    private String id_Cita;
    private String id_Paciente;
    private Nodo_Tratamiento lista_Tratamientos;

    public Nodo_Cita() {
        id_Cita = "";
        id_Paciente = "";
        lista_Tratamientos = null;
    }

    public Nodo_Cita(String id_Cita, String id_Paciente, Nodo_Tratamiento lista_Tratamientos) {
        this.id_Cita = id_Cita;
        this.id_Paciente = id_Paciente;
        this.lista_Tratamientos = lista_Tratamientos;
    }

    public String getId_Cita() {
        return id_Cita;
    }

    public void setId_Cita(String id_Cita) {
        this.id_Cita = id_Cita;
    }

    public String getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(String id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public Nodo_Tratamiento getLista_Tratamientos() {
        return lista_Tratamientos;
    }

    public void setLista_Tratamientos(Nodo_Tratamiento lista_Tratamientos) {
        this.lista_Tratamientos = lista_Tratamientos;
    }
}
