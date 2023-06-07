public class NodoCita
{
    private Cita cita;
    NodoCita siguiente;

    public NodoCita(Cita cita)
    {
        this.cita = cita;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS
     public NodoCita()
    {
        this.cita = null;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS

      
     public void setCita(Cita cita)
    {
        this.cita = cita;
    }//FIN SET DATOS

    public void setSiguiente(NodoCita siguiente)
    {
        this.siguiente = siguiente;
    }//FIN SET SIGUIENTE

    public Cita getCita()
    {
        return cita;
    }//FIN GET DATOS

    public NodoCita getSiguiente()
    {
        return siguiente;
    }//FIN GET SIGUIENTE
    
    public String stringPrimero() {
        return cita.toString(); 
    }
}