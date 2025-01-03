



/**
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas.
 * una matriz bidimensional para almacenar los productos disponibles en la tienda,
 * con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código,
 * y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA , y si la compra supera los $100,
 * se debe aplicar un descuento.
 * Nota : Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;
public class Ejercicio5_InventarioFacturas{
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String[][] productoN = new String[1000][3];
        int cantidad = 0, producto = 0, opcion = 0;
        String busqueda, recarga;
        boolean respuesta;
        while (cantidad == 0) {
            if (producto <= productoN.length) {
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Agregar producto", "2. Actualizar Producto Existente", "3. Buscar producto", "4. Eliminar produto", "5 Terminar", "Escriba la opcion: ");
                opcion = an.nextInt();
            }
            respuesta = false;
            switch (opcion) {
                case 1:
                    System.out.print("Ingresar nombre del producto:");
                    productoN[producto][0] = an.next();
                    System.out.print("Ingresar precio:");
                    productoN[producto][1] = an.next();
                    System.out.print("Ingresar cantidad:");
                    productoN[producto][2] = an.next();
                    producto++;
                    break;
                case 3:
                    System.out.print("¿Que producto busca?: ");
                    busqueda = an.next();
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
                    recarga = an.next();
                    for (int i = 0; i < productoN.length; i++) {
                        if (recarga.equals(productoN[i][0])) {
                            System.out.println("Ingresar nuevo precio: ");
                            productoN[i][1] = an.next();
                            System.out.println("Ingresar nueva cantidad: ");
                            productoN[i][2] = an.next();
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
                    busqueda = an.next();
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
