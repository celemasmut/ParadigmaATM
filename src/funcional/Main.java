package funcional;

import java.util.function.Function;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {

        Function<Double, Function<Double, Double>> conversorGenerico = a -> b -> a * b;

        Function<Double, Double> millasAKilometros = conversorGenerico.apply(1.609);

        Function<Double, Double> onzasAGramos = conversorGenerico.apply(2.8345);

        Double a1 = 1.0;
        Double b1 = 5.0;

        System.out.println(millasAKilometros.apply(a1));
        System.out.println(onzasAGramos.apply(b1));

        System.out.println("Factorial de 3: " + factorial(3));

        System.out.println("'HOLA' como cadena invertida: " + reverse("HOLA"));
    }

    public static long factorial(long n){
        return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
    }

    public static String reverse(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        } else {
            return reverse(palabra.substring(1)) + palabra.charAt(0);
        }
    }

}
