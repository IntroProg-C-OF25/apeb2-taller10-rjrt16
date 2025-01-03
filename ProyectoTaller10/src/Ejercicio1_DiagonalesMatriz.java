
/**
 * Ejercicio 1
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio1_DiagonalesMatriz {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int tmatriz = 0;
        System.out.print("Deme tamanio de la matriz: ");
        tmatriz = an.nextInt();
        int matriz[][] = new int[tmatriz][tmatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nDiagonal Principal, obvia");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }

            }
        }

        System.out.println("\nDiagonal principal, Eficiente");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }

        System.out.println("\nDiagonal Secundaria, obvia");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }

            }
        }
        System.out.println("\nDiagonal secundaria, eficiente");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + "\t");

        }
        System.out.println("\nUbicados abajo de la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nUbicados sobre la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nUbicados abajo de la diagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j > matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nUbiacados sobre la diagonal secundaria ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j < matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
    }
}
