package cajeroAutomatico;

public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(Double saldo, String cbu){
        super(saldo,cbu);
    }


    @Override
    public void mostrarSaldo(){
        System.out.println("Tu saldo de cuenta corriente es de: " + super.getSaldo());
    }

}
