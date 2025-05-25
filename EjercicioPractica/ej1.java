package Modelo3;
import Implementaciones.ColaEstatica;
import Implementaciones.PilaTF;
import TDA.ColaTDA;
import TDA.PilaTDA;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //CREAMOS LOS TDAS
        ColaTDA entrada = new ColaEstatica();
        PilaTDA aux = new PilaTF();
        ColaTDA salida = new ColaEstatica();

        //INICIALIZAMOS TDAS
        entrada.IncializarCola();
        aux.InicializarPila();
        salida.IncializarCola();

        entrada.Acolar(3);
        entrada.Acolar(4);
        entrada.Acolar(5);
        entrada.Acolar(6);

        int cont = 0;
        int total = 0;
        while(!entrada.ColaVacia()){
            aux.Apilar(entrada.Primero());
            cont ++;
            total = total+ entrada.Primero();
            entrada.Desacolar();
        }

        float promedio = total/cont;

        while(!aux.PilaVacia()){
            if(aux.Tope()>promedio && (aux.Tope()-1)>promedio){
                salida.Acolar(aux.Tope());
                aux.Desapilar();
            }
            if(aux.Tope()==promedio && (aux.Tope()-1)==promedio){
                salida.Acolar(aux.Tope());
                aux.Desapilar();
            }
            if(aux.Tope()<promedio && (aux.Tope()-1)==promedio){
                salida.Acolar(aux.Tope());
                aux.Desapilar();
            }else {
                salida.Acolar(aux.Tope());
                salida.Acolar(0);
                aux.Desapilar();
            }

        }
    }
}
