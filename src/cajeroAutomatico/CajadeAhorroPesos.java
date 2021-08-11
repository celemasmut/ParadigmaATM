package cajeroAutomatico;

public class CajadeAhorroPesos extends CuentaBancaria{

    public CajadeAhorroPesos(Double saldo, String cbu){
        super(saldo,cbu);
    }



    @Override
    public void mostrarSaldo(){
        System.out.println("Tu saldo de Caja de ahorro en pesos es de " + super.getSaldo());
    }
}
