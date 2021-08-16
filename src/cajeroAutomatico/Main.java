package cajeroAutomatico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ATM atm = new ATM(new Usuario("Indi", "123",null,null,null));
        atm.menu();
        
    }
}
