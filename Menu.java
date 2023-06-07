import javax.swing.JOptionPane;

public class Menu 
{
    OperacionesMedico operaMedico = new OperacionesMedico();
    OperacionesPaciente operaPaciente = new OperacionesPaciente();
    OperacionesTDAPaciente operaTDAPaciente = new OperacionesTDAPaciente();

    

    Tratamiento limpiezaDental;
    Tratamiento calzasDentales;
    Tratamiento tratamientoDeNervio;
    Tratamiento extraccionDental;
    Paciente paciente;
    Medico medico;


    

    public void menu()
	{
		String opcion, numeroPaciente, numeroDoctor;
		char opc;
		int datos, buscarNodo;

        limpiezaDental = new Tratamiento("1" , "Limpieza dental", 25000);
        calzasDentales = new Tratamiento("2" , "calzasDentales dental", 15000);
        tratamientoDeNervio = new Tratamiento("3" , "tratamientoDeNervio", 30000);
        extraccionDental = new Tratamiento("4" , "extraccionDental", 10000);
		
		do{
			opcion = JOptionPane.showInputDialog("Escoja una opción:"
            + "\n.1.Agregar un paciente, UN DOCTOR O UN TRATAMIENTO" 
            + "\n2.Agregar una cita" 
            + "\n3.Ver Citas" 
			+ "\n4.Ver Pacientes" 
            + "\n5.Ver Tratamientos" 
            + "\n6.Ver Medicos"
            + "\n7.Mostrar la ganancia total"
            + "\n8.Salir");
			opc = opcion.charAt(0);
			switch(opc)
			{
				case '1':  	//Agregar un paciente, UN DOCTOR O UN TRATAMIENTO
                do {
                    opcion = JOptionPane.showInputDialog("Escoja una opción:"
                    + "\n.1.Agregar un paciente" 
                    + "\n2.Agregar un doctor" 
                    + "\n3.Agregar un tratamiento" 
                    + "\n4.Salir");
                    opc = opcion.charAt(0);

                    switch(opc)
                    {
                        case'1':

                            String idPaciente = JOptionPane.showInputDialog("Ingrese el ID del paciente:");

                            if(operaPaciente.verificarPaciente(idPaciente) == true)
                            {
                                JOptionPane.showMessageDialog(null, "CLIENTE CON MISMO CODIGO VUELVA A EJECUTAR");
                            }
                            else
                            {
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
                                String direccion = JOptionPane.showInputDialog("Ingrese la dirección del paciente:");
                                String numeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del paciente:");
                                String yearAfiliacion = JOptionPane.showInputDialog("Ingrese el año de afiliación del paciente:");
        
                                paciente = new Paciente(idPaciente, nombre, direccion, numeroTelefono, yearAfiliacion);
                                JOptionPane.showMessageDialog(null, operaPaciente.agregarPaciente(paciente, 0));
                            }
    
                            System.out.println(paciente);
                        break;

                        case'2':

                        String idMedico = JOptionPane.showInputDialog("Ingrese el ID del medico:");

                            if(operaMedico.verificarMedico(idMedico) == true)
                            {
                                JOptionPane.showMessageDialog(null, "CLIENTE CON MISMO CODIGO VUELVA A EJECUTAR");
                            }
                            else
                            {
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
                                
        
                                medico = new Medico(idMedico, nombre);
                                JOptionPane.showMessageDialog(null, operaMedico.agregarMedico(medico, 0));
                            }
    
                            System.out.println(medico);

                        break;

                        case'3':

                        break;

                        case'4':

                        JOptionPane.showMessageDialog(null, "VOLVIENDO AL MENU");
                        break;

                        default:
                        JOptionPane.showMessageDialog(null, "ERROR DE NUMERO VUELVA A INGRESAR");

                        break;
                    }
                    
                } while (opc!='4');

				break;		
				
				case '2':  //Agregar una cita

                if(operaPaciente.veriPaciente() == true)
                {
                    numeroPaciente = JOptionPane.showInputDialog(null, "Digite el paciente para agregarle una cita" + operaPaciente.listaPaciente2()+"\n");

                    numeroDoctor = JOptionPane.showInputDialog(null, "Digite el doctor a asignar" + operaMedico.listaMedico());

                    do{
                        opcion = JOptionPane.showInputDialog(null, "Escoja una opción:"
                        + "\n1.Ver Tratamientos"
                        + "\n2.Salir" );

                        opc = opcion.charAt(0);

                        
                        switch(opc)
                        {
                            case'1'://VER TRATAMIENTOS

                            JOptionPane.showMessageDialog(null,  limpiezaDental.toString2() + "\n" + calzasDentales.toString2() + "\n" + tratamientoDeNervio.toString2() + "\n" + extraccionDental.toString2());

                            break;

                            case'2': //SALIR

                            JOptionPane.showMessageDialog(null,"Listo");

                            break;
                        }
                    } while (opc != '2');
                }
                else
                JOptionPane.showMessageDialog(null, "NO HAY PACIENTES PARA AGREGARLE UNA CITA");
				
				case '3':  //Ver citas
					
				break;
				
				case '4':  //Ver pacientes

                JOptionPane.showMessageDialog(null, operaPaciente.listaPaciente());
					
				break;
				
				case '5':  //Ver tratamientos

                JOptionPane.showMessageDialog(null,  limpiezaDental.toString() + "\n" + calzasDentales.toString() + "\n" + tratamientoDeNervio.toString() + "\n" + extraccionDental.toString());
					
				break;
				
				case '6':  //Ver medicos

                JOptionPane.showMessageDialog(null, operaMedico.listaMedico());

					
				break;

                case '7':  //Mostrar la ganancia total
					

				break;
				
				case '8':  //Salir
					JOptionPane.showMessageDialog(null, "Muchas gracias");
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "La opción escogida es incorrecta");
			}//Fin del switch						
		}while(opc!='8');
		
	}//Fin del método menu
}
