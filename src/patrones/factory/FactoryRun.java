package patrones.factory;

import java.util.Scanner;

public class FactoryRun {

    public static void main(String[] args){

        FactoryShape factory = new FactoryShape();
        String input;
        Scanner console = new Scanner(System.in);



        do{
        System.out.println("Ingrese CIRCLE, TRIANGLE O SQARE");
        input = console.nextLine();
        Shape shape = factory.createShape(input);
        shape.draw();
        System.out.println("Desea continuar S/N");
        input = console.nextLine();
        }
        while(!input.equals("N"));

    }
}
