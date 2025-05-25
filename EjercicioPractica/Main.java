package EjercicioClase1205;
import Implementaciones.ImplementacionColaDinamica;
import Implementaciones.ImplementacionDicSimple;
import TDA.ColaDinamicaTDA;
import TDA.DiccionarioSimpleTDA;

import java.util.Scanner;


public class Main {
    private static boolean bandera = true;

    public static void main(String[] args) {

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


                System.out.println("Ingrese la descripcion del articulo: ");
                String descripcion = scanner.nextLine();

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


                if (dato == 1) {
                    System.out.println(Simple.Recuperar(codigo));
                } else if (dato == 0) {

                }
                bandera = false;
            }
        }
        scanner.close();
    }
}