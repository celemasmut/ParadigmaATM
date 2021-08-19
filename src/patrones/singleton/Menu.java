package patrones.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static void  main(String [] args){

        Integer input;
        Scanner console = new Scanner(System.in);
        String codeInput;
        String nameInput;



        Map<String,Product> products = new HashMap<>();
        Map<String,Client> clients = new HashMap<>();


        do {
            System.out.println("Elija una opcion");
            System.out.println("1- crear producto");
            System.out.println("2- crear cliente");
            System.out.println("3- Vender");
            input = console.nextInt();
            switch (input){
                case 1:
                    System.out.println("Ingrese el codigo de producto");
                    codeInput = console.next();
                    System.out.println("Ingrese el nombre del producto");
                    nameInput = console.next();
                    System.out.println("Ingrese el precio");
                    Double price = console.nextDouble();
                    products.put(codeInput,new Product(codeInput,nameInput,price,"murmu"));
                    break;
                case 2:
                    System.out.println("Ingrese el codigo de cliente");
                    codeInput = console.next();
                    System.out.println("Ingrese el nombre del cliente");
                    nameInput = console.next();
                    clients.put(codeInput,new Client(codeInput,nameInput,nameInput,"murmu"));
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del producto que desea vender");
                    codeInput = console.next();
                    System.out.println("Ingrese el codigo del cliente que le desea vender el producto");
                    nameInput = console.next();
                    Sale sale = new Sale(products.get(codeInput),clients.get(nameInput),"murmu");
                    break;

            }
            System.out.println("Desea continuar? s/n");
            codeInput = console.next();

        }
        while (!codeInput.equals("n"));

        Log log =Log.getInstance();
        log.printLogs();
    }
}
