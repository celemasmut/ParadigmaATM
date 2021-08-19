package funcional;

import java.util.function.BiFunction;

public class FuncionPura {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> resta = (a, b) -> {if(a > b) return (a-b);else return (b-a);};

        System.out.println( resta.apply(3,6));
    }
}
