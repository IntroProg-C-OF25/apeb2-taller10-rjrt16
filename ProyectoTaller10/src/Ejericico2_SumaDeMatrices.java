
import java.util.Scanner;

/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros
 * aleatorios, desarrollar su procesamiento para calcular y presentar: La suma
 * de las dos matrices (considerar las restricciones matemáticas para ello) . La
 * multiplicación de las dos matrices (considerar las reglas matemáticas para
 * ello) .
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejericico2_SumaDeMatrices {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String respuesta;
        int fila1, fila2, columna1, columna2;

        System.out.print("Introduce el número de filas de la primera matriz:");
        fila1 = an.nextInt();
        System.out.print("Introduce el número de columnas de la primera matriz:");
        columna1 = an.nextInt();

        System.out.print("Introduce el número de filas de la segunda matriz:");
        fila2 = an.nextInt();
        System.out.print("Introduce el número de columnas de la segunda matriz:");
        columna2 = an.nextInt();

        int[][] matriz1 = new int[fila1][columna1];
        int[][] matriz2 = new int[fila2][columna2];
        int[][] suma = new int[fila1][columna1];
        int[][] multiplicacion = new int[fila2][columna2];

        System.out.println("Matriz1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Matriz2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("¿Suma o multiplicacion?");
        respuesta = an.next();
        switch (respuesta) {
            case "suma":
                if ((fila1 == fila2) && (columna1 == columna2)) {
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[0].length; j++) {
                            suma[i][j] = matriz1[i][j] + matriz2[i][j];
                            System.out.print("[ " + suma[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("Si no son iguales no se suman");
                }

                break;
            case "multiplicacion":
                if (columna1 == fila2) {
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz2[0].length; j++) {
                            for (int k = 0; k < matriz2.length; k++) {
                                multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < multiplicacion.length; i++) {
                        for (int j = 0; j < multiplicacion[0].length; j++) {
                            System.out.print("[ " + multiplicacion[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("Si no son iguales no se multiplican");
                }
            default:
                System.out.println("Debe ser suma o multiplicacion");
        }
    }
}
/*run:
Introduce el número de filas de la primera matriz:3
Introduce el número de columnas de la primera matriz:3
Introduce el número de filas de la segunda matriz:3
Introduce el número de columnas de la segunda matriz:3
Matriz1
0	9	0	
2	9	2	
7	4	5	
Matriz2
1	1	8	
1	9	9	
3	7	4	
¿Suma o multiplicacion?
suma
[ 1 ] [ 10 ] [ 8 ]  
[ 3 ] [ 18 ] [ 11 ]  
[ 10 ] [ 11 ] [ 9 ]  
*/