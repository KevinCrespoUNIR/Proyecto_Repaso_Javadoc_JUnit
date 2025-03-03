package javabean;

/**
 * <p>La clase contiene las funciones que suman números, ya sean enteros o reales.
 * Reciben dos o tres parámetros de entrada y devuelven el resultado de la operación</p>
 * @author Kevin Crespo Romero
 * {@link Calculadora}
 * <a href="">Mi GitHub</a>
 * @version 1.0
 * @see Calculadora
 */

public class Suma {

    /**
     * <p>Suma dos números reales y devuelve el resultado {@link Calculadora}</p>
     * @param real1 primer número real
     * @param real2 segundo número real
     * @return La suma de los dos parámetros de entrada
     * @throws IllegalArgumentException si se introducen números que no sean válidos
     * @see #sumarDosReales(double, double)
     */
    public double sumarDosReales(double real1, double real2){
        if(Double.isNaN(real1) || Double.isNaN(real2)) {
            throw new IllegalArgumentException("Los valores deben ser válidos");
        }
        return real1 + real2;
    }

    /**
     * <p>Suma dos numeros enteros y devuelve el resultado {@link Calculadora}</p>
     * @param entero1 Primer número entero
     * @param entero2 Segundo número entero
     * @return la suma de dos parámetros de entrada
     * @throws IllegalArgumentException si no se introducen números válidos
     * @see #sumarDosEnteros(int, int)
     */
    public int sumarDosEnteros(int entero1, int entero2){
        if(Double.isNaN(entero1) || Double.isNaN(entero2)) {
            throw new IllegalArgumentException("Los valores deben ser números enteros");
        }
        return entero1 + entero2;
    }

    /**
     * <p>Suma tres numeros reales y devuelve el resultado {@link Calculadora}</p>
     * @param real1 Primer número real
     * @param real2 Segundo número real
     * @param real3 Tercer número real
     * @return la suma de los tres parámetros de entrada
     * @throws IllegalArgumentException si no se introducen números válidos
     */
    public double sumarTresReales(double real1, double real2, double real3){
        if(Double.isNaN(real1) || Double.isNaN(real2) || Double.isNaN(real3)){
            throw new IllegalArgumentException("Los tres parámetros deben ser números reales");
        }
        return real1+real2+real3;
    }
}
