public class OperacionesCita 
{
    Cita cita;
    OperacionesTDACita listaCita  = new OperacionesTDACita();
    OperacionesTDACita listaCitaAux = new OperacionesTDACita();
    public String agregarCita(Cita cita, int valor) 
    {
        String mensaje= "";
        if (listaCita.esVacia())   
        {
           
            listaCita.inserta(cita,0);
            mensaje="La cita fue agregada";
        }
        else
        {
            if(verificarCita(cita.getIdCita()))
            {
                mensaje = "Ya hay una cita con ese codigo vuelva agregar a el medico con otro codigo";
            }
            else
                listaCita.inserta(cita, 0);
                mensaje="La cita fue agregada";
    
        }
        return mensaje;
    }

    public String listaCita()
    {
        String mensaje = "";
        
        if(!listaCita.esVacia())
        {
            while(!listaCita.esVacia())
            {
                mensaje += "\n" + listaCita.primero().idCita+ "\n"
                        + listaCita.primero().idCita + "\n";

                listaCitaAux.inserta(listaCita.primero(), 0);
                listaCita.suprime(0);
                System.out.println("Si entro en la lista");
            }
            while(!listaCitaAux.esVacia())
            {
                listaCita.inserta(listaCitaAux.primero(), 0);
                listaCitaAux.suprime(0);
            }
        }
        else
            System.out.println("Lista vacia");
        return mensaje;
    }

    public boolean verificarCita(String idCita) 
    {
        while(!listaCita.esVacia())
        {
            if(listaCita.primero().getIdCita().equals(idCita) || listaCita.primero() == null)
            {
                return true;
            }

            else
            {   
                listaCitaAux.inserta(listaCita.primero(), 0);
                listaCita.suprime(0); 
            }   
        }

        while(!listaCitaAux.esVacia())
        {
            listaCita.inserta(listaCitaAux.primero(), 0);
            listaCitaAux.suprime(0);
        }

        return false; // No se encontró ningún paciente con el mismo idPaciente
    }
}
