package cajeroAutomatico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ATM atm = new ATM(new Usuario("Indi", "123", new CajadeAhorroDolares(300.00, "4433665588774433225575"), new CajadeAhorroPesos(60000.00, "5646789434765432457563"), new CuentaCorriente(10000.00, "1234567891234567891234",-20000.0)));
        atm.menu();
        
    }
}
