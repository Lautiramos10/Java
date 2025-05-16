package EjercicioClase1205;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    int Recuperar(int clave);
    ConjuntosTDA Claves();
}
