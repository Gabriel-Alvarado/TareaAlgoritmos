public class OperacionesMedico 
{
    Medico medico;
    OperacionesTDAMedico listaMedico  = new OperacionesTDAMedico();
    OperacionesTDAMedico listaMedicoAux = new OperacionesTDAMedico();
    public String agregarMedico(Medico medico, int valor) 
    {
        String mensaje= "";
        if (listaMedico.esVacia())   
        {
           
            listaMedico.inserta(medico,0);
            mensaje="El medico fue agregado";
        }
        else
        {
            if(verificarMedico(medico.getIdMedico()))
            {
                mensaje = "Ya hay un medico con ese codigo vuelva agregar a el medico con otro codigo";
            }
            else
                listaMedico.inserta(medico, 0);
                mensaje="El medico fue agregado";
    
        }
        return mensaje;
    }

    public String listaMedico()
    {
        String mensaje = "";
        
        if(!listaMedico.esVacia())
        {
            while(!listaMedico.esVacia())
            {
                mensaje += "\n" + listaMedico.primero().idMedico+ "\n"
                        + listaMedico.primero().nombre + "\n";

                listaMedicoAux.inserta(listaMedico.primero(), 0);
                listaMedico.suprime(0);
                System.out.println("Si entro en la lista");
            }
            while(!listaMedicoAux.esVacia())
            {
                listaMedico.inserta(listaMedicoAux.primero(), 0);
                listaMedicoAux.suprime(0);
            }
        }
        else
            System.out.println("Lista vacia");
        return mensaje;
    }

    public boolean verificarMedico(String idMedico) 
    {
        while(!listaMedico.esVacia())
        {
            if(listaMedico.primero().getIdMedico().equals(idMedico) || listaMedico.primero() == null)
            {
                return true;
            }

            else
            {   
                listaMedicoAux.inserta(listaMedico.primero(), 0);
                listaMedico.suprime(0); 
            }   
        }

        while(!listaMedicoAux.esVacia())
        {
            listaMedico.inserta(listaMedicoAux.primero(), 0);
            listaMedicoAux.suprime(0);
        }

        return false; // No se encontró ningún paciente con el mismo idPaciente
    }
}
