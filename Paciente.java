import java.time.LocalDate;

public class Paciente {
    String idPaciente;
    String nombre;
    String direccion; 
    String numeroTelefono;
    String yearAfilacion;
    int yearSistema;

    public Paciente(String idPaciente, String nombre, String direccion, String numeroTelefono, String yearAfilacion)
    {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.yearAfilacion = yearAfilacion;
    }

    public Paciente()
    {
        idPaciente = "";
        nombre = "";
        direccion = "";
        numeroTelefono = "";
        yearAfilacion = "";
        yearSistema= 0;
    }

    //METODOS SETS

    public void setIdPaciente(String idPaciente)
    {
        this.idPaciente = idPaciente;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setNumeroTelefono(String numeroTelefono)
    {
        this.numeroTelefono = numeroTelefono;
    }

    public void setYearAfilacion(String yearAfilacion)
    {
        this.yearAfilacion = yearAfilacion;
    }

    ////////////////////////



    //METODOS GETS

    public String getIdPaciente()
    {
        return idPaciente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public String getNumeroTelefono()
    {
        return numeroTelefono;
    }

    public String getYearAfilacion()
    {
        return yearAfilacion;
    }

    public int getYearSistema()
    {
        return LocalDate.now().getYear();
    }
    
}
