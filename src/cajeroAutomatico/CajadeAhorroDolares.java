package cajeroAutomatico;

public class CajadeAhorroDolares extends CuentaBancaria{

    //solo dolar
    public CajadeAhorroDolares(Double saldo, String cbu, TipoMoneda tipoDeMoneda){
        super(saldo,cbu, TipoMoneda.DOLARES);
    }

    public void mostrarSaldo(){
        System.out.println("Tu saldo de Caja de ahorro en dolares es de  " + super.getSaldo());
    }

    @Override
    public void depositarValor(Double deposita, TipoMoneda moneda) {
        if(moneda.equals(getTipoDeMoneda())){
            super.setSaldo(getSaldo() + deposita);
        } else {
            System.out.println("Error en el tipo de moneda.");
        }
    }

    @Override
    public void extraerDinero(Double extrae) {
        //TODO
    }
}
