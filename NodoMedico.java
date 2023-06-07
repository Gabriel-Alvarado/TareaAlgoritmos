public class NodoMedico
{
    private Medico medico;
    NodoMedico siguiente;

    public NodoMedico(Medico medico)
    {
        this.medico = medico;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS
     public NodoMedico()
    {
        this.medico = null;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS

      
     public void setMedico(Medico medico)
    {
        this.medico = medico;
    }//FIN SET DATOS

    public void setSiguiente(NodoMedico siguiente)
    {
        this.siguiente = siguiente;
    }//FIN SET SIGUIENTE

    public Medico getMedico()
    {
        return medico;
    }//FIN GET DATOS

    public NodoMedico getSiguiente()
    {
        return siguiente;
    }//FIN GET SIGUIENTE
    
    public String stringPrimero() {
        return medico.toString(); // asumiendo que la clase Paciente tiene una implementación adecuada del método toString()
    }
}