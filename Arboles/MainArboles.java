package tp0;

public class   {

    public static void main(String[] args) {
        ABBTDA boletin = new ABB();
        
        boletin.InicializarBoletin();
        boletin.AgregarCal(5);
        boletin.AgregarCal(3);
        boletin.AgregarCal(8);
        boletin.AgregarCal(1);
        boletin.AgregarCal(4);
        boletin.AgregarCal(7);
        boletin.AgregarCal(9);
   
        
 
        // MOSTRAR ARBOL EN ORDEN ASCENDENTE
        System.out.print("Calificaciones en orden: ");
        inOrder(boletin);
        System.out.println();
        
        
        // BUSCAR ELEMENTO, EXISTE O NO?
        System.out.println();
        int elementoBuscado = 2;
        boolean buscarCalificacion = buscarCalificacion(elementoBuscado, boletin);
        System.out.println("La calificacion " + elementoBuscado + (buscarCalificacion ? " pertenece" : " no pertenece") + " al boletin del alumno.");
     //   buscarCalificacion(4,boletin);
        System.out.println();
        
        // MOSTRAR PROMEDIO DEL ARBOL
        System.out.println();
        int suma = Suma(boletin);
        int elementos = contador(boletin);
        double promedio = (elementos != 0) ? (double) suma / elementos : 0;
        System.out.println("Promedio de calificaciones del alumno es: " + promedio);
        System.out.println();
        
        // MOSTRAR ARBOL EN FORMA JERARQUICA
        
        ((ABB) boletin).MostrarArbol();

    }
    
    // MOSTRAR ARBOL EN ORDEN ASCENDENTE
    
    public static void inOrder(ABBTDA arbol) {
        if (!arbol.ArbolVacio()) {
            inOrder(arbol.HijoIzq()); 
            System.out.print(arbol.Raiz() + " "); 
            inOrder(arbol.HijoDer()); 
        }
    }
    
    // BUSCAR ELEMENTO, EXISTE O NO?
    
    public static boolean buscarCalificacion(int n, ABBTDA arbol) {
        if (arbol.ArbolVacio()) {
            return false;
        } else if (arbol.Raiz() == n) {
            return true;
        } else if (arbol.Raiz() > n) {
            return buscarCalificacion(n, arbol.HijoIzq());
        } else {
            return buscarCalificacion(n, arbol.HijoDer());
        }
    }
    	
    // MOSTRAR PROMEDIO DEL ARBOL
    
    public static int contador(ABBTDA arbol) {
        if (arbol.ArbolVacio()) {
            return 0;
        } else {
            return 1 + contador(arbol.HijoIzq()) + contador(arbol.HijoDer());
        }
    }
    
    public static int Suma(ABBTDA arbol) {
		if (arbol.ArbolVacio()) {
			return 0;
		} else {
			return(arbol.Raiz()+Suma(arbol.HijoDer())+Suma(arbol.HijoIzq()));
		}
	}
    
    
}

