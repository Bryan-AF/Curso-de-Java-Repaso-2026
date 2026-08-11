//IMPORTA LA CLASE  (para leer datos del teclado)
import java.util.Scanner;

//ES LA ESTRUCTURA O CONTENEDOR PRINCIPAL DE MI PROGRAMA
public class HolaMundo_Ejercicios {

    //INICIA LA CLASE. ES LA PUERTA DE ENTRADA DE CUALQUIER PROGRAMA
    public static void main (String[]args ) {
        // ============ EJERCICIO 1 ============
        // Imprime mi nombre en lugar de "¡Hola Mundo!"
        System.out.println("Bryan Alejandro Flores");

        // ============ EJERCICIO 2 ============
        // Imprime "Hola" y "Mundo" en DOS líneas con UN SOLO println
        System.out.println("hola\nmundo");

        // ============ EJERCICIO 3 ============
        // Comentario que explica lo que hace cada línea
        System.out.println("tengo 16 años, mi color favorito es el azul y vivo en veracruz");

        // ============ EJERCICIO 4 ============
        /* Comentario en varias líneas:
           hola bro como te encuentras, estoy retomando programacion.
           CUIDATE, AMO A LA CHICA DE LA IGLESIA */
        System.out.println("...");

        // ============ EJERCICIO 5 ============
        // Imprime edad, color favorito y ciudad
        System.out.println("Edad: 16 años");
        System.out.println("Color favorito: azul");
        System.out.println("Ciudad: Veracruz");

        // ============ EJERCICIO 6 ============
        // Explora System.err, la salida de errores (aparece en rojo)
        System.out.println("Este mensaje sale por System.out");
        System.err.println("Este mensaje sale por System.err");

        // ============ EJERCICIO 7 ============
        // Varias impresiones que arman UNA sola frase
        System.out.print("Hola, ");
        System.out.print("soy Bryan ");
        System.out.println("y quiero que salga gta 6 y el nuevo gears.");

        // ============ EJERCICIO 8 ============
        // Diseño ASCII
        System.out.println(":( / ;) / XD / :/");

        // ============ EJERCICIO 9 ============
        // Prueba: borra temporalmente el método main, ejecuta y observa el error

        // ============ EJERCICIO 10 ============
        // Si el nombre del archivo es diferente al de la clase, NO compila.
        // Respuesta: DA ERROR

        //println = imprime lo que está en comillas y baja a la línea siguiente
        //print = imprime y no baja, así que con dos print seguidos las palabras se juntan en la misma línea
    }
}
