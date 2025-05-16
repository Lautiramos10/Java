package tp0;

public interface ABBTDA {
	void InicializarBoletin();				// sin precondiciones
	int Raiz();								// árbol inicializado y no vacío
	ABBTDA HijoIzq();						// árbol inicializado y no vacío
	ABBTDA HijoDer();						// árbol inicializado y no vacío
	void AgregarCal(int x);				// árbol inicializado
	void EliminarCal(int x);				// árbol inicializado
	boolean ArbolVacio();					// árbol inicializado
}
