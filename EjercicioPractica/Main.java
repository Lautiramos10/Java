package EjercicioClase1205;
import java.util.HashMap;
import java.util.Scanner;
import TDA.ColaTDA;
import TDA.ColaEstatica;


public class Main {
    private static boolean bandera = true;

    public static void main(String[] args) {

        HashMap<String, String> Nombre = new HashMap<>();
        HashMap<String, String> Descripcion = new HashMap<>();

        DiccionarioSimpleTDA Simple = new ImplementacionDicSimple();
        ColaDinamicaTDA Cola = new ImplementacionColaDinamica();

        Scanner scanner = new Scanner(System.in);

        Simple.InicializarDiccionario();
        Cola.InicializarCola();

        while (bandera) {
            System.out.println("Ingrese 1 si desea cargar, ingrese 0 si desea conocer detalles");
            int carga = scanner.nextInt();

            if (carga == 1) {
                System.out.println("Ingrese el codigo de producto: ");
                int codProducto = scanner.nextInt();

                System.out.println("Ingrese el precio del producto: ");
                int precio = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();
                Nombre.put(String.valueOf(codProducto), nombre);

                System.out.println("Ingrese la descripcion del articulo: ");
                String descripcion = scanner.nextLine();
                Descripcion.put(String.valueOf(codProducto), descripcion);

                Simple.Agregar(codProducto, precio);
                Cola.Acolar(codProducto);

            }

            if (carga == 0) {
                System.out.println("Ingrese el codigo del producto:");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese 1 si desea conocoer el precio o 0 si desea conocer la descripcion ");
                int dato = scanner.nextInt();

                String clave = String.valueOf(codigo);
                System.out.println("el nombre es:" + Nombre.get(clave));

                if (dato == 1) {
                    System.out.println(Simple.Recuperar(codigo));
                } else if (dato == 0) {
                    System.out.println(Descripcion.get(clave));
                }
                bandera = false;
            }
        }
        scanner.close();
    }
}
