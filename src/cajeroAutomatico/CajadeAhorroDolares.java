package cajeroAutomatico;

public class CajadeAhorroDolares extends CuentaBancaria{
    public CajadeAhorroDolares(Double saldo, String cbu){
        super(saldo,cbu);
    }

    @Override
    public void mostrarSaldo(){
        System.out.println("Tu saldo de Caja de ahorro en dolares es de  " + super.getSaldo());
    }
}
