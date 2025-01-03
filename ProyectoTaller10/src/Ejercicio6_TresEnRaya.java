
/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3 . 
 * Permita a dos jugadores marcar sus movimientos alternativamente. 
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author Ricardo Rosales
 */
import java.util.Scanner;
public class Ejercicio6_TresEnRaya {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String[][] juego = new String[3][3];
        boolean si1 = true, intento = true, si = true, pe;
        String respuesta;
        int fila, columna, random, random2;
        while (si1) {
            System.out.print("Jugamos? : ");
            respuesta = an.next();
            if (respuesta.equals("si")) {
                for (int i = 0; i < juego.length; i++) {
                    for (int j = 0; j < juego.length; j++) {
                        System.out.print("{  }");
                        juego[i][j] = " ";
                    }
                    System.out.println(" ");
                }
                while (intento) {
                    System.out.println("Ingresa cordenadas: ");
                    fila = an.nextInt();
                    columna = an.nextInt();
                    juego[fila][columna] = "x";
                    for (int i = 0; i < juego.length; i++) {
                        for (int j = 0; j < juego.length; j++) {
                            System.out.print("{ " + juego[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    random = (int) (Math.random() * 3);
                    random2 = (int) (Math.random() * 3);
                    si = true;
                    while (si) {
                        if (juego[random][random2].equals(("x"))) {
                            random = (int) (Math.random() * 3);
                            random2 = (int) (Math.random() * 3);
                        } else if (juego[random][random2].equals(("O"))) {
                            random = (int) (Math.random() * 3);
                            random2 = (int) (Math.random() * 3);
                        } else {
                            juego[random][random2] = "O";
                            si = false;
                        }
                    }
                    System.out.println("++++++++++++++++++++++++++++++");
                    for (int i = 0; i < juego.length; i++) {
                        for (int j = 0; j < juego.length; j++) {
                            System.out.print("{ " + juego[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    pe = true;
                    while (pe) {

                        if ((juego[0][0].equals(juego[1][1]) && (juego[1][1].equals(juego[2][2])))) {
                            if (juego[0][0].equals("x")) {
                                System.out.println("ganaste");
                                si1 = false;
                                intento = false;
                                pe = false;
                            } else if (juego[0][0].equals("O")) {
                                System.out.println("ganaste");
                                si1 = false;
                                intento = false;
                                pe = false;

                            }
                            if ((juego[0][2].equals(juego[1][1]) && (juego[1][1].equals(juego[2][0])))) {
                                if (juego[0][2].equals("x")) {
                                    System.out.println("ganaste");
                                    si1 = false;
                                    intento = false;
                                    pe = false;
                                } else if (juego[0][2].equals("O")) {
                                    System.out.println("ganaste");
                                    si1 = false;
                                    intento = false;
                                    pe = false;

                                }

                            }

                        }
                        for (int i = 0; i < juego.length; i++) {

                            if (juego[i][0].equals(juego[i][1])) {
                                if (juego[i][2].equals(juego[i][0])) {
                                    if (juego[i][0].equals("x")) {
                                        System.out.println("Ganaste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    } else if (juego[i][0].equals("O")) {
                                        System.out.println("Perdiste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    }
                                }
                            }
                            if (juego[0][i].equals(juego[1][i])) {
                                if (juego[2][i].equals(juego[0][i])) {
                                    if (juego[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    } else if (juego[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    }
                                }
                            }
                            if (juego[0][2].equals(juego[1][1])) {
                                if (juego[2][0].equals(juego[1][1])) {
                                    if (juego[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    } else if (juego[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        si1 = false;
                                        intento = false;
                                        pe = false;
                                    }
                                }
                            }

                        }
                        pe = false;

                    }
                }
            }
        }
    }
}

