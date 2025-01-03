
/**
 * Crea un programa que gestione el inventario de una tienda.
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda,
 * con información como nombre, precio y cantidad. El programa debe permitir agregar nuevos productos,
 * actualizar existencias, buscar productos y eliminarlos.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio4_Inventario {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] productoN = new String[1000][3];
        int cantidad = 0, producto = 0, opcion = 0;
        String busqueda, recarga;
        boolean respuesta;
        while (cantidad == 0) {
            if (producto <= productoN.length) {
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Agregar producto", "2. Actualizar Producto Existente", "3. Buscar producto", "4. Eliminar produto", "5 Terminar", "Escriba la opcion: ");
                opcion = tcl.nextInt();
            }
            respuesta = false;
            switch (opcion) {
                case 1:
                    System.out.print("Ingresar nombre del producto:");
                    productoN[producto][0] = tcl.next();
                    System.out.print("Ingresar precio:");
                    productoN[producto][1] = tcl.next();
                    System.out.print("Ingresar cantidad:");
                    productoN[producto][2] = tcl.next();
                    producto++;
                    break;
                case 3:
                    System.out.print("¿Que producto busca?: ");
                    busqueda = tcl.next();
                    for (int i = 0; i < productoN.length; i++) {
                        if (busqueda.equals(productoN[i][0])) {
                            System.out.println("Producto: " + busqueda);
                            System.out.println("Precio: " + productoN[i][1]);
                            System.out.println("Cantidad: " + productoN[i][2]);
                            break;
                        }
                        respuesta = true;
                        if (respuesta) {
                            System.out.println("no se encontro el producto");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.print("Cual producto desea actualizar: ");
                    recarga = tcl.next();
                    for (int i = 0; i < productoN.length; i++) {
                        if (recarga.equals(productoN[i][0])) {
                            System.out.println("Ingresar nuevo precio: ");
                            productoN[i][1] = tcl.next();
                            System.out.println("Ingresar nueva cantidad: ");
                            productoN[i][2] = tcl.next();
                            respuesta = true;
                            break;
                        }
                        respuesta = true;
                        if (respuesta) {
                            System.out.println("no se encontro el producto");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingresar producto a eliminar: ");
                    busqueda = tcl.next();
                    for (int i = 0; i < productoN.length; i++) {
                        if (busqueda.equals(productoN[i][0])) {
                            productoN[i][0] = " ";
                            productoN[i][0] = " ";
                            productoN[i][0] = " ";
                            producto--;
                            break;
                        }
                        respuesta = true;
                        if (respuesta) {
                            System.out.println("no se encontro el producto");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Salio del sistema");
                    cantidad = 1;
                    break;
                default:
                    System.out.println("Intentelo de nuevo");
            }

        }

    }
}
/*
run:
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
1
Ingresar nombre del producto:pan
Ingresar precio:0.5
Ingresar cantidad:5
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
2
Cual producto desea actualizar: leche
no se encontro el producto
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
4
Ingresar producto a eliminar: leche
no se encontro el producto
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
3
¿Que producto busca?: pan
Producto: pan
Precio: 0.5
Cantidad: 5
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
4
Ingresar producto a eliminar: pan
1. Agregar producto
2. Actualizar Producto Existente
3. Buscar producto
4. Eliminar produto
5 Terminar
Escriba la opcion: 
5
Salio del sistema
 */
