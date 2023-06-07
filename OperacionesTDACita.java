public class OperacionesTDACita
{
    Cita cita;
    NodoCita primero, ultimo, aux, aux2, nuevo;
    int cantNodos = 0;
    
    //inserta(x, p) = inserta x en la posiciÃ³n p de la lista, pasando los elementos 
    //de la posiciÃ³n p y siguientes a la posiciÃ³n inmediatamente posterior. 	
    
    public void inserta(Cita cita, int pos) {
        nuevo = new NodoCita(cita);

        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } 
        else
        {
            
            nuevo.setSiguiente(primero);
            primero = nuevo;      
            ultimo=primero;
            
        }
    }
    
    //vacia()=Devuelve un true si la lista L se encuentra vacia y un false en caso contrario.	
    public boolean esVacia() 
    {
        if (primero == null) 
        {
            return true;
        } 
        else 
        {
            return false;
        }

    }//Fin del metodo vacia
    
    //imprimirLista()=Imprime los elementos en su orden de apariciÃ³n en la lista. 	
    public String imprimirListaCita() {
        String mensaje = "";
        int i = 1;
        if (!esVacia()) {
            mensaje = "Los valores almacenados en la lista son:\n";
            aux = primero;
            while (aux != null) {
                mensaje += "Posicion: " + i + " - Valor: " + aux.getCita() + "\n";
                aux = aux.getSiguiente();
                i++;
            }//Fin del while
        }//Fin del if
        else {
            mensaje = "La lista se encuentra vacia";
        }
        return mensaje;

    }//Fin del metodo imprimirLista
    
    //primero()=devuelve el valor de x que se encuentra en la primera posiciÃ³n de la lista.	
    public Cita primero() 
    {
        if (!esVacia()) 
        {
            return primero.getCita();
            
        } 
        else
        {
            System.err.println("ENTRO EN EL METODO CITA  PRIMERO, LA LISTA ESTA VACIA");
            return null;
        }
        
    }

    public void suprime(int pos) {
        if (!esVacia()) {
            if (pos == 0) {
                primero = primero.getSiguiente();
                if (primero == null) {
                    ultimo = null;
                }
            } else if (pos < cantNodos) {
                aux = primero;
                for (int i = 1; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                if (pos == cantNodos - 1) {
                    ultimo = aux;
                }
            }
            cantNodos--;
        }
    }
}
