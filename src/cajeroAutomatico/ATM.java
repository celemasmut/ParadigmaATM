package cajeroAutomatico;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    Usuario miUsuario;
    
    public ATM(Usuario miUsuario){
        this.miUsuario=miUsuario;
    }
    static Scanner scan = new Scanner(System.in);
    Historial miHistorial = Historial.getInstance();


    public void menu(){
        boolean salir = false;
        CuentaBancaria bankAccount;
        do {
            System.out.println("Elija lo que desea hacer:");
            System.out.println("1 - Acceder a Caja de Ahorro en Pesos");
            System.out.println("2 - Acceder a Caja de Ahorro en Dólares");
            System.out.println("3 - Acceder a Cuenta Corriente");
            System.out.println("4 - Mostrar historial de operaciones");
            System.out.println("5 - Salir");
            int opcion = capturarInt(5);
            if(opcion == 4){
                miHistorial.mostrarMovimientos();
            } else {
                CuentaFactory miCuenta = new CuentaFactory();
                bankAccount = miCuenta.creadorDeCuenta(opcion);
                if(bankAccount == null){
                    salir = true;
                }else{
                    cuentaElegida(bankAccount, opcion);
                }
            }
        } while (!salir);
    }

    public void cuentaElegida(CuentaBancaria miCuenta, int opcion){
        boolean salir = false;
        String miNombreCuenta = getNombreCuenta(opcion);
        do {
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Retirar valor");
            System.out.println("4 - Salir de la cuenta");

            opcion = capturarInt(4);

            switch (opcion) {
                case 1:
                    miCuenta.mostrarSaldo();
                    miHistorial.agregarMovimiento(LocalDate.now(),"Se ha verificado el saldo", miNombreCuenta);
                    break;
                case 2:
                    TipoMoneda monedaElegida = seleccionDeMoneda(miCuenta);
                    System.out.println("Ingrese valor a depositar");
                    double valorADepositar = capturarDouble();
                    miCuenta.depositarValor(valorADepositar, monedaElegida);
                    miHistorial.agregarMovimiento(LocalDate.now(),"Se ha depositado $" + valorADepositar, miNombreCuenta);
                    miCuenta.mostrarSaldo();
                    break;
                case 3:
                    Double montoARetirar;
                    int opcionElegida = capturarInt(miCuenta.mostrarOpciones());
                    if(opcionElegida == 6){
                        System.out.println("Ingrese el monto que desee retirar ");
                        montoARetirar = capturarDouble();
                        miCuenta.extraerDinero(montoARetirar);
                    }else{
                        montoARetirar= miCuenta.opcionesARetirar(opcionElegida);
                        miCuenta.extraerDinero(montoARetirar);
                    }
                    miHistorial.agregarMovimiento(LocalDate.now(),"Se extrajo $" + montoARetirar, miNombreCuenta);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(!salir);

    }

    private String getNombreCuenta(int opcion) {
        switch(opcion){
            case 1:
                return "Caja de Ahorro en Pesos";
            case 2:
                return "Caja de Ahorro en Dólares";
            case 3:
                return "Cuenta Corriente";
        }
        return null;
    }

    public TipoMoneda seleccionDeMoneda(CuentaBancaria miCuenta){
        TipoMoneda miMoneda= null;
        
        int opcion = capturarInt(miCuenta.opcionDeMoneda());
        switch (opcion){
            case 1:
                miMoneda = TipoMoneda.PESOS;
                break;
            case 2:
                miMoneda = TipoMoneda.DOLARES;
                break;
        }
        return miMoneda;
    }

    public void cambiarContrasenia(Usuario miUsuario){
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

    public int capturarInt(int opciones){
        int entrada;
        do{
            try {
                entrada = scan.nextInt();
                if (entrada <= 0 || entrada > opciones) {
                    System.out.println("Opción errónea. Ingrese nuevamente su opción:");
                    entrada = -1;
                }
            }catch (InputMismatchException e){
                System.out.println("Ingrese opción valida:");
                scan.next();
                entrada = -1;
            }
        }while (entrada == -1);
        return entrada;
    }

    public double capturarDouble(){
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
