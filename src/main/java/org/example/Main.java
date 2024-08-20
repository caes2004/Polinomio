package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    // Ejercicio taller #1
        int vecA[] = {5, 2, 3, 4, 5, 6, 7};
        int vecB[] = {5, 2, 3, 4, 5, 6, 7};
        Main main = new Main();
        System.out.println("-------------Punto 1-------------");
        main.sonIguales(vecA, vecB);
    // Ejercicio taller #2
        int poliP[] = {4, 3, 4, 5, 6, 7};
       // Exponte donde se desea ingresar el coeficiente.
        int expoP = 3;
        int coeP = 7;
        System.out.println("-------------Punto 2-------------");
        main.insertarTermino(poliP, coeP, expoP);

    //Ejercicio taller #3
        System.out.println("-------------Punto 3-------------");
        main.sumarPares(vecA, vecB);

    //Ejercicio taller #4
        System.out.println("-------------Punto 4-------------");
        int vecEva[]={4,6,7,8,-9,12};
        System.out.println("Vector a evaluar es:");
        for(int i=0;i<vecEva.length;i++){
            System.out.println(vecEva[i]+ " ");
        }
        System.out.println();
        main.evaluarPolinomio(vecEva);
        System.out.println("-------------Derivar-------------");
        int vecDev[]={3,3,4,5,6};
        System.out.println("Vector a derivar es:");
        for(int i=0;i<vecDev.length;i++){
            System.out.println(vecDev[i]+ " ");
        }
        main.derivarPolinomio(vecDev);

    //Ejercicio taller #5
        System.out.println("-------------Punto 5-------------");

        PolinomioManager gestor = new PolinomioManager();

        int vec5[]= {4,5,6,-7,9,-12};
        gestor.mostrar(vec5);



    }

    public void sonIguales(int vecA[], int vecB[]) {

        int i = 0;
        int j = 0;
        int sw = 1;


        while (i < vecA[0] + 2 && j < vecB[0] + 2 && sw == 1) {

            if (vecA[i] == vecB[j]) {
                i++;
                j++;
            } else {

                System.out.println("Los polinomios no son iguales");
                sw = 0;
            }


        }

        if (sw == 1) {

            System.out.println("Los polinomios son iguales. ");
        }

    }

    public void insertarTermino(int poliP[], int expoP, int coeP) {

        int gradoP0 = poliP[0];

        if (expoP<= gradoP0) {

            for (int i = 1; i < poliP[0] + 2; i++) {

                if (poliP[0] + 2 - i == expoP) {
                    poliP[i]=coeP;
                }
            }
            for (int i = 1; i < poliP[0] + 2; i++) {
                System.out.println(poliP[i]);
            }
        } else {
            System.out.println("El exponente ingresado es mayor que el grado del polinomio.");
        }


    }


    public void sumarPares( int vecA[], int vecB[]){

        int vecC[]= new int [vecA[0]];

        int i=1;
        int j=1;
        int k=1;
        int coeA=0;
        int coeB=0;
        int expoA=0;
        int expoB=0;
        if(vecA[0]!= vecB[0]){

            System.out.println("Los polinomios son de diferente grado.");
        }
        while (i< vecA[0]+2 && j < vecB[0]+2) {

                  expoA=vecA[0]+1-i;
                  expoB=vecA[0]+1-i;

                 if(expoA % 2==0 && expoB % 2==0){
                     vecC[k]= vecA[i]+vecB[j];
                     k++;
                 }
            i++;
            j++;
        }
        System.out.println("Vector C:");
        for(k=1;k<vecC.length;k++){

            System.out.println(vecC[k]);
        }


    }


    //Se crea clase estatica para permitir alamcenar el o los polinomios en un arraylist y sin necesidad que el metodo reciba este como parametro.

    public static class PolinomioManager {
        private List<String> polinomios = new ArrayList<>(); // Lista para almacenar los polinomios

        public void mostrar(int vec5[]) {
            String polinomio = "";
            int expo = 0;
            for (int i = 1; i < vec5[0] + 2; i++) {
                expo = vec5[0] + 1 - i;
                if (vec5[i] != 0) {
                    if (vec5[i] > 0) {
                        polinomio = polinomio + " + " + vec5[i] + " X^" + expo;
                    } else {
                        polinomio = polinomio + " - " + Math.abs(vec5[i]) + " X^" + expo;
                    }
                }
            }
            System.out.println("Polinomio resultante del vector: ");
            System.out.println(polinomio);
            polinomios.add(polinomio); // Almacenar el polinomio en la lista

            // Mostrar todos los polinomios almacenados mediante el uso de un for each.
            System.out.println("El(los) polinomio(s) almacenado(s) es(son): ");
            for (String p : polinomios) {
                System.out.println(p);
            }
        }
    }
    public void evaluarPolinomio(int vecEva[]){

        System.out.println("En esta caso se evaluará el polinomio por 1.");

        int evaluar=1;
        int i=0;
        int suma=0;
        for(i=1;i<vecEva[0]+2;i++){
            int multi= vecEva[i]*evaluar;

                suma = suma + multi;

        }
        System.out.println("Su evaluación es : "+suma);

    }

    public void derivarPolinomio(int vecDev[]){

        int i=0;
        int expo=0;
        int opeExpo=0;
        String polinomio="";

        for (i=1;i<vecDev[0]+2;i++){
            expo= vecDev[0]+1 - i;
            opeExpo= expo-1;
            //polinomio=vecDev[i]*expo;
            if(vecDev[i]!=0){
                if (vecDev[i] > 0) {
                    polinomio=polinomio + " + " +(vecDev[i]*(expo))+"X^"+opeExpo;

                }else{

                    polinomio=polinomio + " - " +((vecDev[i]*-1)*(expo))+"X^"+opeExpo;
                }
            }
        }
        System.out.println(polinomio);
    }

}

