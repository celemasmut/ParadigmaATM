package cajeroAutomatico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        boolean salir = false;
        do {
            Usuario miUsuario = new Usuario("Indi", "123", new CajadeAhorroDolares(300.00, "4433665588774433225575"), new CajadeAhorroPesos(60000.00, "5646789434765432457563"), new CuentaCorriente(10000.00, "1234567891234567891234"));

            System.out.println("Elija la cuenta a la que desea ingresar:");
            System.out.println("1 - Caja de Ahorro en Pesos");
            System.out.println("2 - Caja de Ahorro en Dólares");
            System.out.println("3 - Cuenta Corriente");
            System.out.println("4 - Cambiar contraseña");
            System.out.println("5 - Salir");


            int opcion = capturarInt(5);

            switch (opcion) {
                case 1:
                    cuentaElegida(miUsuario.getMisPesos());
                    break;
                case 2:
                    cuentaElegida(miUsuario.getMisDolares());
                    break;
                case 3:
                    cuentaElegida(miUsuario.getMiCuentaCorriente());
                    break;
                case 4:
                    cambiarContrasenia(miUsuario);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (!salir);
    }

    public static void cuentaElegida(CuentaBancaria miCuenta){
        boolean salir = false;
        do {
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Retirar valor");
            System.out.println("4 - Salir de la cuenta");

            int opcion = capturarInt(4);

            switch (opcion) {
                case 1:
                    miCuenta.mostrarSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese valor a depositar");
                    double valorADepositar = capturarDouble();
                    miCuenta.depositarvalor(valorADepositar);
                    miCuenta.mostrarSaldo();
                    break;
                case 3:
                    Double montoARetirar;
                    int opcionElegida = capturarInt(miCuenta.mostrarOpciones());
                    if(opcionElegida == 6){
                        montoARetirar = capturarDouble();
                        miCuenta.extraerDinero(montoARetirar);
                    }else{
                         montoARetirar= miCuenta.opcionesARetirar(opcionElegida);
                        miCuenta.extraerDinero(montoARetirar);
                    }
                    break;
                case 4:
                    salir = true;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(!salir);

    }

    public static void cambiarContrasenia(Usuario miUsuario){
        System.out.println("Ingrese la contraseña actual:");
        scan.nextLine();
        String passActual = scan.next();
        while(!miUsuario.getContrasenia().equals(passActual)){
            System.out.println("Error. Ingrese nuevamente la contraseña:");
            scan.nextLine();
            passActual = scan.nextLine();
        }
        System.out.println("Ingrese la nueva contraseña:");
        miUsuario.setContrasenia(scan.nextLine());
        System.out.println("Contraseña actualizada.");
    }

    public static int capturarInt(int opciones){
        int entrada;
        do{
            try {
                entrada = scan.nextInt();
                if (entrada <= 0 || entrada > opciones) {
                    System.out.println("Opción errónea. Ingrese nuevamente su opción:");
                    entrada = -1;
                }
            }catch (InputMismatchException e){
                System.out.println("Ingrese opcion valida:");
                scan.next();
                entrada = -1;
            }
        }while (entrada == -1);
        return entrada;
    }

    public static double capturarDouble(){
        Double entrada;
        do{
            try {
                entrada = scan.nextDouble();
                if (entrada <= 0 || entrada == null) {
                    System.out.println("Valor incorrecto. Ingrese nuevamente un valor:");
                    entrada = -1.0;
                }
            }catch (InputMismatchException e){
                System.out.println("Ingrese valor valido:");
                scan.next();
                entrada = -1.0;
            }
        }while (entrada == -1.0);
        return entrada;
    }
}
