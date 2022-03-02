package Ejercicio3;

import static Ejercicio3.Votaciones.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] canciones = new int[100][2];
        rellenar(canciones);
        votar(canciones);
        ordenar(mostrar(canciones));
    }
}
