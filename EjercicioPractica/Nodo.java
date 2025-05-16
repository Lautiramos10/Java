package EjercicioClase1205;

public class Nodo {
    int info;
    Nodo sig;

    public Nodo(int info, Nodo sig) {
        this.info = info;
        this.sig = sig;
    }
    public int getValue() {
        return info;
    }

    public Nodo getNext() {
        return sig;
    }

    public void setNext(Nodo siguiente) {
        this.sig = siguiente;
    }

}
