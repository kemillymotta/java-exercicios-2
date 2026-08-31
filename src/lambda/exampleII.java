package lambda;

import java.util.Arrays;

public class exampleII {

    /* transparencia referencial é quando o resultado da função depende
    exclusivamente dos valores de entrada
    sempre vai ter o mesmo resultado para os mesmos valores de entrada na
    */

    /* em programação funcional a expressão lambda corresponde a uma função
    anonima de primeira classe
    */

    /* calculo lambda = formalismo matematico base da programação funcional*/



    public static int globalValue = 3;

    public static void main(String[] args) {

        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }


}
