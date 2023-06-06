package nodos;

import Objetos.Paciente;

public class Nodo_Paciente {
    private Paciente paciente;
    private Nodo_Paciente siguiente;

    public Nodo_Paciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Nodo_Paciente() {
        paciente = null;
        siguiente = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Nodo_Paciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Paciente siguiente) {
        this.siguiente = siguiente;
    }
}
