
/**
 *El primer ciclo paralelo C , cuenta con 28 estudiantes, de los cuales al finalizar el período,
 * la Dirección de la carrera de Computación a solicitó las siguientes estadísticas de la materia I
 * NTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular
 * (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones ( ACD que representa el 35% de la nota, APE del 35%
 * y la nota del AA con un peso del 30% ) . En resumen, los requerimientos son los siguientes:
 *
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD , APE , AA , para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD ->35%, APE ->35%, y el AA ->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase) .
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase) .
 *
 * @author Ricardo Rosales
 */
public class Ejercicio3_Calificaciones {

    public static void main(String[] args) {

        String[] nombre = {"Silvestre", "Alison", "Pablo", "Mejillon", "Oscars", "Nikolov", "Messi", "Ricardo", "Thiago", "Axel", "Mark", "Ethan", "Peru", "Nikita", "Nicole", "Jose", "Issac", "Reyna", "Carmen", "Java", "Paolo", "Sol", "Victor", "Blad", "Arion", "Nimir", "Leon", "Onodera"};
        double[] acd = new double[nombre.length];
        double[] ape = new double[nombre.length];
        double[] aa = new double[nombre.length];
        double[] promedio = new double[nombre.length];
        double maximo = 0, minimo = 10, total = 0;
        int maximo1 = 0, maximo2 = 0, cont = 0, cont2 = 0;

        for (int i = 0; i < nombre.length; i++) {
            acd[i] = (double) (Math.random() * 10);
            ape[i] = (double) (Math.random() * 10);
            aa[i] = (double) (Math.random() * 10);
            promedio[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.3);
            total += promedio[i];
            if (maximo < promedio[i]) {
                maximo = promedio[i];
                maximo1 = i;
            }
            if (minimo > promedio[i]) {
                minimo = promedio[i];
                maximo2 = i;
            }

        }
        total /= 28;
        for (int j = 0; j < nombre.length; j++) {
            if (promedio[j] < total) {
                cont++;
            } else {
                cont2++;
            }
        }
        System.out.printf("%s%.2f%n", "El promedio del curso es: ", total);
        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i] >= total) {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", nombre[i], " ,ACD = ", acd[i], " ,APE = ", ape[i], " AA =  ", aa[i], " ,PROMEDIO = ", promedio[i], " (el estudiante esta por encima del promedio del curso)");
            } else {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", nombre[i], " ,ACD", acd[i], " ,APE", ape[i], " ,AA ", aa[i], " ,PROMEDIO: ", promedio[i], " (el estudiante esta por debajo del promedio del curso)");

            }

        }
        System.out.println("Existen: " + cont + " por encima del promedio\n" + "Existen: " + cont2 + " Por debajo del promedio");
        System.out.printf("%s%s%s%.2f%s%s%s%.2f%n", "El mejor estudiantes es: ", nombre[maximo1], " con: ", promedio[maximo1], "\nEl peor es: ", nombre[maximo2], " con: ", promedio[maximo2]);
    }
}
/*run:
El promedio del curso es: 5.21
Silvestre ,ACD = 9.87 ,APE = 8.52 AA =  0.46 ,PROMEDIO = 6.58 (el estudiante esta por encima del promedio del curso)
Alison ,ACD0.74 ,APE4.17 ,AA 6.29 ,PROMEDIO: 3.60 (el estudiante esta por debajo del promedio del curso)
Pablo ,ACD = 9.97 ,APE = 1.71 AA =  6.85 ,PROMEDIO = 6.14 (el estudiante esta por encima del promedio del curso)
Mejillon ,ACD = 4.20 ,APE = 8.83 AA =  3.37 ,PROMEDIO = 5.57 (el estudiante esta por encima del promedio del curso)
Oscars ,ACD = 4.58 ,APE = 3.57 AA =  8.98 ,PROMEDIO = 5.55 (el estudiante esta por encima del promedio del curso)
Nikolov ,ACD6.11 ,APE4.73 ,AA 4.06 ,PROMEDIO: 5.01 (el estudiante esta por debajo del promedio del curso)
Messi ,ACD3.21 ,APE4.83 ,AA 2.53 ,PROMEDIO: 3.58 (el estudiante esta por debajo del promedio del curso)
Ricardo ,ACD = 4.50 ,APE = 7.84 AA =  7.92 ,PROMEDIO = 6.69 (el estudiante esta por encima del promedio del curso)
Thiago ,ACD0.06 ,APE6.51 ,AA 7.61 ,PROMEDIO: 4.58 (el estudiante esta por debajo del promedio del curso)
Axel ,ACD2.29 ,APE4.72 ,AA 8.24 ,PROMEDIO: 4.93 (el estudiante esta por debajo del promedio del curso)
Mark ,ACD = 5.73 ,APE = 8.76 AA =  8.83 ,PROMEDIO = 7.72 (el estudiante esta por encima del promedio del curso)
Ethan ,ACD5.48 ,APE3.54 ,AA 5.37 ,PROMEDIO: 4.76 (el estudiante esta por debajo del promedio del curso)
Peru ,ACD = 3.16 ,APE = 7.27 AA =  8.32 ,PROMEDIO = 6.14 (el estudiante esta por encima del promedio del curso)
Nikita ,ACD = 5.45 ,APE = 7.01 AA =  3.75 ,PROMEDIO = 5.48 (el estudiante esta por encima del promedio del curso)
Nicole ,ACD5.14 ,APE1.72 ,AA 4.46 ,PROMEDIO: 3.74 (el estudiante esta por debajo del promedio del curso)
Jose ,ACD = 4.53 ,APE = 8.01 AA =  6.77 ,PROMEDIO = 6.42 (el estudiante esta por encima del promedio del curso)
Issac ,ACD = 1.32 ,APE = 7.02 AA =  8.76 ,PROMEDIO = 5.55 (el estudiante esta por encima del promedio del curso)
Reyna ,ACD5.90 ,APE0.35 ,AA 5.36 ,PROMEDIO: 3.80 (el estudiante esta por debajo del promedio del curso)
Carmen ,ACD = 7.27 ,APE = 8.01 AA =  2.81 ,PROMEDIO = 6.19 (el estudiante esta por encima del promedio del curso)
Java ,ACD2.45 ,APE4.88 ,AA 5.95 ,PROMEDIO: 4.35 (el estudiante esta por debajo del promedio del curso)
Paolo ,ACD = 2.88 ,APE = 9.24 AA =  4.28 ,PROMEDIO = 5.53 (el estudiante esta por encima del promedio del curso)
Sol ,ACD = 8.84 ,APE = 7.75 AA =  8.04 ,PROMEDIO = 8.22 (el estudiante esta por encima del promedio del curso)
Victor ,ACD2.72 ,APE4.58 ,AA 0.29 ,PROMEDIO: 2.64 (el estudiante esta por debajo del promedio del curso)
Blad ,ACD8.93 ,APE2.26 ,AA 2.73 ,PROMEDIO: 4.74 (el estudiante esta por debajo del promedio del curso)
Arion ,ACD3.06 ,APE1.51 ,AA 0.43 ,PROMEDIO: 1.73 (el estudiante esta por debajo del promedio del curso)
Nimir ,ACD4.48 ,APE2.05 ,AA 7.04 ,PROMEDIO: 4.40 (el estudiante esta por debajo del promedio del curso)
Leon ,ACD = 6.78 ,APE = 8.55 AA =  6.20 ,PROMEDIO = 7.23 (el estudiante esta por encima del promedio del curso)
Onodera ,ACD0.17 ,APE6.17 ,AA 9.52 ,PROMEDIO: 5.08 (el estudiante esta por debajo del promedio del curso)
Existen: 14 por encima del promedio
Existen: 14 Por debajo del promedio
El mejor estudiantes es: Sol con: 8.22
El peor es: Arion con: 1.73
*/