package EjercicioClase1205;

public interface ColaDinamicaTDA {
    void InicializarCola();
    void Acolar(int x); // Cambié "Asociar" por "Acolar" para que coincida con la implementación
    void Desacolar();
    boolean ColaVacia();
    int Primero();
}
