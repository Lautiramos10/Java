package EjercicioClase1205;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar (int clave, int valor);
    void Eliminar(int clave);
    void EliminarValor(int clave, int valor);
    ConjuntosTDA Recuperar (int clave);
    ConjuntosTDA Claves();
}
