public class Cita {
    String idCita;
    String idPaciente;
    String idDeLosTratamientos;
    String idMedico;
    int costoTotal;

    public Cita(String idCita, String idPaciente, String idDeLosTratamientos, String idMedico, int costoTotal) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDeLosTratamientos = idDeLosTratamientos;
        this.idMedico = idMedico;
        this.costoTotal = costoTotal;
    }

    //METODOS SETS

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdDeLosTratamientos(String idDeLosTratamientos) {
        this.idDeLosTratamientos = idDeLosTratamientos;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    //METODOS GETS

    public String getIdCita() {
        return idCita;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdDeLosTratamientos() {
        return idDeLosTratamientos;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public int getCostoTotal() {
        return costoTotal;
    }
    
}
