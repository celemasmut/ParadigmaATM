package cajeroAutomatico;

public class CuentaFactory {

    CuentaBancaria cuentaElegida;

    public  CuentaBancaria creadorDeCuenta(int opcion){
        switch (opcion) {
            case 1:
                cuentaElegida= new CajadeAhorroPesos(74885.00, "5646789434765432457563",TipoMoneda.PESOS);
                break;
            case 2:
                cuentaElegida= new CajadeAhorroDolares(300.00,"4433665588774433225575",TipoMoneda.DOLARES);
                break;
            case 3:
                cuentaElegida= new CuentaCorriente(10000.00,"1234567891234567891234",-20000.00,TipoMoneda.PESOS);
                break;
            case 5:
                System.out.println("Vuelva pronto");
                break;
        }
        return cuentaElegida;
    }
}
