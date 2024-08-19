package org.example;

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
        int expoP = 3;
        int coeP = 7;
        System.out.println("-------------Punto 2-------------");
        main.insertarTermino(poliP, coeP, expoP);

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
}

