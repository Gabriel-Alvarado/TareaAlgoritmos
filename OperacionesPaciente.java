public class OperacionesPaciente {
    Paciente paciente;
    
    OperacionesTDAPaciente listaPaciente;
    OperacionesTDAPaciente listaPacienteAux ;
    public OperacionesPaciente()
    {
        this.listaPaciente = new OperacionesTDAPaciente();
        this.paciente= new Paciente();
        this.listaPacienteAux=new OperacionesTDAPaciente();
    }

    public String agregarPaciente(Paciente paciente, int valor) 
    {
        String mensaje= "";
        if (listaPaciente.esVacia())   
        {
           // this.paciente = paciente; //Guarda la referencia del paciente
            listaPaciente.inserta(paciente,0);
            mensaje="El paciente fue agregado";
        }
        else
        {
            if(verificarPaciente(paciente.getIdPaciente()))
            {
                mensaje = "Ya hay un paciente con ese codigo vuelva agregar a el paciente con otro codigo";
            }
            else
                listaPaciente.inserta(paciente, 0);
                mensaje="El paciente fue agregado";
    
        }
        return mensaje;
    }
    
    public String listaPaciente()
    {
        String mensaje = "";
        
        if(!listaPaciente.esVacia())
        {
            while(!listaPaciente.esVacia())
            {
                mensaje += "\n" + listaPaciente.primero().idPaciente+ "\n"
                        + listaPaciente.primero().nombre + "\n"
                        + listaPaciente.primero().direccion+ "\n"
                        +listaPaciente.primero().numeroTelefono+ "\n"
                        +listaPaciente.primero().yearAfilacion+ "\n";
                listaPacienteAux.inserta(listaPaciente.primero(), 0);
                listaPaciente.suprime(0);
                System.out.println("Si entro en la lista");
            }
            while(!listaPacienteAux.esVacia())
            {
                listaPaciente.inserta(listaPacienteAux.primero(), 0);
                listaPacienteAux.suprime(0);
            }
        }
        else
            System.out.println("Lista vacia");
        return mensaje;
    }

    public boolean verificarPaciente(String idPaciente) 
    {
        while(!listaPaciente.esVacia())
        {
            if(listaPaciente.primero().getIdPaciente().equals(idPaciente) || listaPaciente.primero() == null)
            {
                return true;
            }

            else
            {   
                listaPacienteAux.inserta(listaPaciente.primero(), 0);
                listaPaciente.suprime(0); 
            }   
        }

        while(!listaPacienteAux.esVacia())
        {
            listaPaciente.inserta(listaPacienteAux.primero(), 0);
            listaPacienteAux.suprime(0);
        }

        return false; // No se encontró ningún paciente con el mismo idPaciente
    }
    


    public String listaPaciente2()
    {
        String mensaje = "";
        
        if(!listaPaciente.esVacia())
        {
            while(!listaPaciente.esVacia())
            {
                mensaje += "\n" + listaPaciente.primero().idPaciente+ "\n"
                        + listaPaciente.primero().nombre + "\n";
                listaPacienteAux.inserta(listaPaciente.primero(), 0);
                listaPaciente.suprime(0);
                System.out.println("Si entro en la lista");
            }
            while(!listaPacienteAux.esVacia())
            {
                listaPaciente.inserta(listaPacienteAux.primero(), 0);
                listaPacienteAux.suprime(0);
            }
        }
        else
            System.out.println("Lista vacia");
        return mensaje;
    }

    public Paciente encontrarPaciente(String idPaciente)
    {
        while(!listaPaciente.esVacia())
        {
            if(verificarPaciente(idPaciente) == true)
            {
                return listaPaciente.primero();
            }
            else
            {
                listaPacienteAux.inserta(listaPaciente.primero(), 0);
                listaPaciente.suprime(0);
            }
        }
        

        while(!listaPacienteAux.esVacia())
        {
            listaPaciente.inserta(listaPacienteAux.primero(), 0);
            listaPacienteAux.suprime(0);
        }
        return null;
    }

    public boolean veriPaciente()
    {
        if(!listaPaciente.esVacia())
        {
            return true;
        }
        return false;
    }
}

