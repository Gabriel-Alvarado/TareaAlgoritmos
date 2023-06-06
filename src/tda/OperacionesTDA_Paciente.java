package tda;

import objetos.Paciente;
import nodos.Nodo_Paciente;

public class OperacionesTDA_Paciente {
    Nodo_Paciente primero, ultimo, aux, aux2, nuevo;
    int cantNodos = 0;

    /**
     * Inserta un paciente al nodo correspondiente.
     *
     * @param paciente Objeto paciente.
     * @param indice   Posicion a almacenar.
     */
    public void inserta(Paciente paciente, int indice) {
        nuevo = new Nodo_Paciente(paciente);
        if (esVacia()) {
            primero = nuevo;
            ultimo = primero;
        } else {
            if (indice == 0) {
                nuevo.setSiguiente(primero);
                primero = nuevo;
            } else {
                if (cantNodos > indice) {
                    aux = primero;
                    for (int i = 1; i < indice; i++)
                        aux = aux.getSiguiente(); //Se ubica en la posicion indicada
                    nuevo.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(nuevo);
                } else {
                    ultimo.setSiguiente(nuevo);
                    ultimo = nuevo;
                }

            }
        }
        cantNodos++;
    }

    //localiza(x) = Esta función devuelve la posición de x en la lista L.
//Si x figura más de una vez en L, la posición de la primera aparición de x es la que se devuelve.
    public int localiza(String id_Paciente) {
        int indice = 0;
        if (esVacia()) return -2;    //La lista esta vacia
        else {
            aux = primero;
            while (aux != null) {
                if (aux.getPaciente().getId_Paciente().equals(id_Paciente)) return indice;        //Devuelve la posicion
                else aux = aux.getSiguiente();
                indice++;
            }//Fin del while
        }//Fin del else
        return -1;        //No se encuentra ese valor
    }//Fin del metodo localiza

    //recupera(p)=devuelve el elemento que está en la posición p de la lista
    public String recupera(int pos) {
        if (esVacia()) return "La lista se encuentra vacia	";
        else {
            if (pos < cantNodos) {
                aux = primero;
                for (int i = 0; i < pos; i++)
                    aux = aux.getSiguiente(); //Se ubica en la posicion indicada
                return "ID: " + aux.getPaciente().getId_Paciente() + ".\nNombre: " + aux.getPaciente().getNombre_Paciente() + ".\nDireccion: " + aux.getPaciente().getDireccion_Paciente() + ".\nTelefono: " + aux.getPaciente().getTelefono_Paciente() + ".\nAfiliacion: " + aux.getPaciente().getFecha_Afiliacion();
            }//Fin del if
        }
        return "La posicion no se encuentra";

    }//Fin del metodo recupera

    //suprime(p) = elimina el elemento en la posición p de la lista.
    public int suprime(int pos) {
        if (esVacia()) return -2;        //La lista esta vacia
        else {
            if (pos < cantNodos) {
                if (pos == 0) primero = primero.getSiguiente();
                else {
                    aux = primero;
                    for (int i = 1; i < pos; i++)
                        aux = aux.getSiguiente(); //Se ubica en la posicion anterior a la que necesitamos

                    aux2 = aux.getSiguiente();
                    aux.setSiguiente(aux2.getSiguiente());
                    aux2.setSiguiente(null);
                    if (pos == (cantNodos - 1))    //Si eliminamos el ultimo nodo, colocamos ultimo al final de la lista
                        ultimo = aux;
                }//Fin del else
                cantNodos--;
                return 1;
            }//Fin del if
        }//Fin del else
        return -1;        //La posicion no se encuentra
    }//Fin del metodo anula

    //anula() = Esta función ocasiona que L se convierta en la lista vacía
    public void anula() {
        primero = null;
        ultimo = null;
        cantNodos = 0;
    }//Fin del metodo anula

    //primero()=devuelve el valor de x que se encuentra en la primera posición de la lista.
    public String primero() {
        if (esVacia()) return "La lista se encuentra vacia";
        else
            return "ID: " + primero.getPaciente().getId_Paciente() + ".\nNombre: " + primero.getPaciente().getNombre_Paciente();
    }//Fin del metodo primero

    //vacia()=Devuelve un true si la lista L se encuentra vacia y un false en caso contrario.
    public boolean esVacia() {
        if (primero == null) return true;
        else return false;

    }//Fin del metodo vacia

    //imprimirLista()=Imprime los elementos en su orden de aparición en la lista.
    public String imprimirLista() {
        String mensaje = "";
        int i = 1;
        if (!esVacia()) {
            mensaje = "Los valores almacenados en la lista son:\n";
            aux = primero;
            while (aux != null) {
                mensaje += "Posicion: " + i + " - ID: " + aux.getPaciente().getId_Paciente() + ". Nombre: " + aux.getPaciente().getNombre_Paciente() + "\n";
                aux = aux.getSiguiente();
                i++;
            }//Fin del while
        }//Fin del if
        else mensaje = "La lista se encuentra vacia";
        return mensaje;


    }//Fin del metodo imprimirLista
}
