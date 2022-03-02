package Ejercicio3;

import java.util.Scanner;

public class Votaciones {

    public static void rellenar(int[][] A) {
        for (int i = 0; i < 100; i++) {
            A[i][0] = i;
        }
    }

    public static void votar(int[][] A) {
        Scanner sc = new Scanner(System.in);
        int elegir;
        System.out.println("Quieres la votacion, pulsa 1 para si 0 para no");
        int opc = sc.nextInt();
        while (opc != 0) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Elije una cancion para votar del 0-99");
                elegir = sc.nextInt();
                A[elegir][1] += 1;
            }
            System.out.println("Quieres pasar otra vez la votacion, pulsa 1 para si 0 para no");
            opc = sc.nextInt();
        }
        ordenar(A);
    }

    public static void ordenar(int[][] A) {
        int aux;
        int aux2;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i][1] < A[j][1]) {
                    aux = A[i][1];
                    A[i][1] = A[j][1];
                    A[j][1] = aux;
                    aux2 = A[i][0];
                    A[i][0] = A[j][0];
                    A[j][0] = aux2;
                }
            }
        }
    }

    public static int[][] mostrar(int[][]A){
        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 2; j++) {
                if (A[i][1] != 0) {
                    System.out.print(A[i][j] + " ");

                }
            }
            if (A[i][1]!=0){
                System.out.println();
            }
        }
        return A;
    }
}
