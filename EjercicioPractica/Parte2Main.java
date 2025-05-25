package EjercicioParte2;
import Implementaciones.ImplementacionColaDinamica;
import Implementaciones.ImplementacionPilaDinamica;
import Implementaciones.ImplementacionConjunto;
import TDA.ColaDinamicaTDA;
import TDA.PilaDinamicaTDA;
import TDA.ConjuntosTDA;
import java.util.Scanner;

//Implementar un sistema de atención en un negocio, donde los clientes se forman en una cola
// dinámica para esperar su turno. Cuando un cliente es atendido, su nombre se guarda en una
// pila dinámica (historial reciente de atención). Además, usa un conjunto para registrar qué
// clientes han visitado el negocio (¡¡OJO!! sin repeticiones). Se debe poder listar los
// clientes atendidos recientemente (desde la pila) y también mostrar cuántos clientes diferentes
// han sido atendidos hasta ahora desde el conjunto.

public class Parte2Main {

    public static void main(String[] args){

        //CREAMOS LAS ESTRUCTURAS
        ColaDinamicaTDA cola = new ImplementacionColaDinamica();
        PilaDinamicaTDA pila = new ImplementacionPilaDinamica();
        ConjuntosTDA conjunto = new ImplementacionConjunto();

        //INICIALIZAMOS EL SCANNER
        Scanner scanner = new Scanner(System.in);

        //INICIALIZAMOS ESTRUCTURAS ESTATICAS
        cola.InicializarCola();
        conjunto.InicializarConjunto();

        System.out.println("Ingrese 1 si llega un cliente , 0 si desea finalizar y 2 si un cliente es atendido");
        int accion = scanner.nextInt();

        if (accion==1){
            System.out.println("Ingrese el nombre del paciente");
            String nombre = scanner.nextLine();


        }



    }
}
