package tp0;

public class ABB implements ABBTDA{

	class NodoABB{
		int info;
		ABBTDA hijoIzq;
		ABBTDA hijoDer;
	}
	
	NodoABB raiz;
	
	public void InicializarBoletin() {
		raiz = null;
	}

	
	public int Raiz() {
		return raiz.info;
	}

	
	public ABBTDA HijoIzq() {
		return raiz.hijoIzq;
	}


	public ABBTDA HijoDer() {
		return raiz.hijoDer;
	}

	// AGREGAR UNA CALIFICACION
	
	public void AgregarCal(int x) {
	    if (x <= 0 || x > 10) {
	        throw new IllegalArgumentException("La calificación debe estar en el rango válido (1-10).");
	    }

	    if (raiz == null) {
	        raiz = new NodoABB();
	        raiz.info = x;
	        raiz.hijoIzq = new ABB();
	        raiz.hijoIzq.InicializarBoletin();
	        raiz.hijoDer = new ABB();
	        raiz.hijoDer.InicializarBoletin();
	    } else if (raiz.info > x) {
	        raiz.hijoIzq.AgregarCal(x);
	    } else if (raiz.info < x) {
	        raiz.hijoDer.AgregarCal(x);
	    }
	}
	
	// ELIMINAR UNA CALIFACION 
	
	public void EliminarCal(int x) {
		if (raiz != null) {
			if (raiz.info == x && raiz.hijoIzq.ArbolVacio() && raiz.hijoDer.ArbolVacio()) {
				raiz = null;
			} else if (raiz.info == x && !raiz.hijoIzq.ArbolVacio()) {
				raiz.info = this.mayor(raiz.hijoIzq);
				raiz.hijoIzq.EliminarCal(raiz.info);
			} else if (raiz.info == x && raiz.hijoIzq.ArbolVacio()) {
				raiz.info = this.menor(raiz.hijoDer);
				raiz.hijoDer.EliminarCal(raiz.info);
			} else if (raiz.info < x) {
				raiz.hijoDer.EliminarCal(x);
			} else {
				raiz.hijoIzq.EliminarCal(x);
			}
		}
	}

	public boolean ArbolVacio() {
		return (raiz == null);
	}

	private int mayor (ABBTDA a) {
		if (a.HijoDer().ArbolVacio()) {
			return a.Raiz();
		} else {
			return mayor(a.HijoDer());
		}
	}
	
	private int menor (ABBTDA a) {
		if (a.HijoIzq().ArbolVacio()) {
			return a.Raiz();
		} else {
			return menor(a.HijoIzq());
		}
	}
	
	
    // MOSTRAR ARBOL EN FORMA JERARQUICA
	
	
	private void MostrarArbol(NodoABB nodo, String indent, boolean last) {
	    if (nodo != null) {
	        System.out.print(indent);
	        if (last) {
	            System.out.print("└─ ");
	            indent += "  ";
	        } else {
	            System.out.print("├─ ");
	            indent += "| ";
	        }
	        System.out.println(nodo.info);
	        MostrarArbol(((ABB) nodo.hijoIzq).raiz, indent, false);
	        MostrarArbol(((ABB) nodo.hijoDer).raiz, indent, true);
	    }
	}
	
	 public void MostrarArbol() {
	        MostrarArbol(raiz, "", true);
	    }
}
