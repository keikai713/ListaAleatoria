package listaaleatoria;

/* Autor: Alejandro Pérez Durán.
 * Fecha de creación: 30 de Septiembre de 2014.
 */
import java.util.Random;

public class ListaAleatoria {

    public static void main(String[] args) {
        Random r; //Declaraciones de variables
        int d;
        Lista lista;
        int k;
        r = new Random(); // se crea generador de números aleatorios
        lista = new Lista(); // se crea lista vacia
        k = 5; //número de nodos son insertados elementos en la lista
        for (; k > 0; k--) {
            d = r.nextInt(); // elementos generados
            System.out.println("elem: " + d + " ");
            lista.insertarCabezaLista(d); // elemento que lo inserta a la cabeza
// se va a la clase lista en el metodo insertar
        }
// son mostrados los elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();
    }
}