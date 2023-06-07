public class NodoPaciente
{
    private Paciente paciente;
    NodoPaciente siguiente;

    public NodoPaciente(Paciente paciente)
    {
        this.paciente = paciente;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS
     public NodoPaciente()
    {
        this.paciente = null;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS

      
     public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }//FIN SET DATOS

    public void setSiguiente(NodoPaciente siguiente)
    {
        this.siguiente = siguiente;
    }//FIN SET SIGUIENTE

    public Paciente getPaciente()
    {
        return paciente;
    }//FIN GET DATOS

    public NodoPaciente getSiguiente()
    {
        return siguiente;
    }//FIN GET SIGUIENTE
    
    public String stringPrimero() {
        return paciente.toString(); // asumiendo que la clase Paciente tiene una implementación adecuada del método toString()
    }
}