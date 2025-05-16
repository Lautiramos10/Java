package EjercicioClase1205;

public class ImplementacionColaDinamica implements ColaDinamicaTDA{
    // Primer elemento de la cola
    Nodo primero;
    // Último elemento de la cola
    Nodo ultimo;

    public void InicializarCola() {
        primero = null;
        ultimo = null;
    }

    public void Acolar(int x) {
        Nodo aux = new Nodo(x, null); // Uso correcto del constructor
        // Por si la cola no está vacía
        if (ultimo != null) {
            ultimo.sig = aux;
        }
        ultimo = aux;

        // Por si la cola está vacía
        if (primero == null) {
            primero = ultimo;
        }
    }

    public void Desacolar() {
        primero = primero.sig;

        // Precaución por si llega a quedar vacía
        if (primero == null) {
            ultimo = null;
        }
    }

    public boolean ColaVacia() {
        return (ultimo == null);
    }

    public int Primero() {
        return primero.info;
    }

}
