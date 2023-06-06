package Objetos;

import nodos.Nodo_Paciente;

public class Paciente {
    private String id_Paciente;
    private String nombre_Paciente;
    private String direccion_Paciente;
    private int telefono_Paciente;
    private int fecha_Afiliacion;

    private Nodo_Paciente siguiente;

    public Paciente() {
        id_Paciente = "";
        nombre_Paciente = "";
        direccion_Paciente = "";
        telefono_Paciente = 0;
        fecha_Afiliacion = 0;
    }

    public Paciente(String id_Paciente, String nombre_Paciente, String direccion_Paciente, int telefono_Paciente, int fecha_Afiliacion) {
        this.id_Paciente = id_Paciente;
        this.nombre_Paciente = nombre_Paciente;
        this.direccion_Paciente = direccion_Paciente;
        this.telefono_Paciente = telefono_Paciente;
        this.fecha_Afiliacion = fecha_Afiliacion;
    }

    public String getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(String id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public String getNombre_Paciente() {
        return nombre_Paciente;
    }

    public void setNombre_Paciente(String nombre_Paciente) {
        this.nombre_Paciente = nombre_Paciente;
    }

    public String getDireccion_Paciente() {
        return direccion_Paciente;
    }

    public void setDireccion_Paciente(String direccion_Paciente) {
        this.direccion_Paciente = direccion_Paciente;
    }

    public int getTelefono_Paciente() {
        return telefono_Paciente;
    }

    public void setTelefono_Paciente(int telefono_Paciente) {
        this.telefono_Paciente = telefono_Paciente;
    }

    public int getFecha_Afiliacion() {
        return fecha_Afiliacion;
    }

    public void setFecha_Afiliacion(int fecha_Afiliacion) {
        this.fecha_Afiliacion = fecha_Afiliacion;
    }
}
