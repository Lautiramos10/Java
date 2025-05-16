package EjercicioClase1205;

public class ImplementacionDicSimple implements DiccionarioSimpleTDA{
    private int[] claves;
    private int[] valores;
    private int cantidad;

    public void InicializarDiccionario() {
        claves = new int[100];
        valores = new int[100];
        cantidad = 0;
    }

    public void Agregar(int clave, int valor) {
        int i = 0;
        while (i < cantidad && claves[i] != clave) {
            i++;
        }
        if (i == cantidad) { // no existe la clave
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        } else { // la clave ya existe, actualizo el valor
            valores[i] = valor;
        }
    }

    public void Eliminar(int clave) {
        int i = 0;
        while (i < cantidad && claves[i] != clave) {
            i++;
        }
        if (i < cantidad) { // si se encontró la clave
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }
    }

    public int Recuperar(int clave) {
        int i = 0;
        while (i < cantidad && claves[i] != clave) {
            i++;
        }
        if (i < cantidad) {
            return valores[i];
        }
        return -1; // o podés lanzar una excepción si preferís
    }

    public ConjuntosTDA Claves() {
        ConjuntosTDA conjunto =new ImplementacionConjunto(); // asumimos que tenés esta clase
        conjunto.InicializarConjunto();
        for (int i = 0; i < cantidad; i++) {
            conjunto.Agregar(claves[i]);
        }
        return conjunto;
    }
}
