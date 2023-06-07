public class NodoTratamiento
{
    private Tratamiento tratamiento;
    NodoTratamiento siguiente;

    public NodoTratamiento(Tratamiento tratamiento)
    {
        this.tratamiento = tratamiento;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS
     public NodoTratamiento()
    {
        this.tratamiento = null;
        this.siguiente = null;

    }//FIN CONSTRUCTOR SIN PARAMETROS

      
     public void setTratamiento(Tratamiento tratamiento)
    {
        this.tratamiento = tratamiento;
    }//FIN SET DATOS

    public void setSiguiente(NodoTratamiento siguiente)
    {
        this.siguiente = siguiente;
    }//FIN SET SIGUIENTE

    public Tratamiento getTratamiento()
    {
        return tratamiento;
    }//FIN GET DATOS

    public NodoTratamiento getSiguiente()
    {
        return siguiente;
    }//FIN GET SIGUIENTE
    
    public String stringPrimero() {
        return tratamiento.toString(); // asumiendo que la clase Paciente tiene una implementación adecuada del método toString()
    }
}