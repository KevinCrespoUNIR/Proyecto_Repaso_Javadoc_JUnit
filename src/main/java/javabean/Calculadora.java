package javabean;

/**
 * <p>Descripción de la clase</p>
 * <pre>{code
 * sumar.sumarDosReales(10.50, 5.50)}</pre>
 *
 * @author Kevin Crespo Romero
 * @version 1.1
 * @see Suma
 */


public class Calculadora {

    /**
     * Clase principal que ejecuta el ejemplo de sumas con la clase {@link Suma}.
     * <p> Esta clase crea un objeto de {@link Suma} y muestra por consola el resultado de la operación.</p>
     */
    public static void main(String[] args) {

        // Objeto de la clase Suma
        Suma sumar = new Suma();

        // Sumar dos reales
        System.out.println(sumar.sumarDosReales(10.50, 5.50));

        //Sumar dos enteros
        System.out.println(sumar.sumarDosEnteros(5,5));

        //Sumar tres reales
        System.out.println(sumar.sumarTresReales(10.50, 10.50, 10.50));

    }
}
