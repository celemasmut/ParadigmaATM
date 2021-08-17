package cajeroAutomatico;

public class CajadeAhorroDolares extends CuentaBancaria{

    //solo dolar
    public CajadeAhorroDolares(Double saldo, String cbu, TipoMoneda tipoDeMoneda){
        super(saldo,cbu, TipoMoneda.DOLARES);
    }

    public void mostrarSaldo(){
        System.out.println("Tu saldo de Caja de ahorro en dólares es de USD" + super.getSaldo());
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
        if((super.getSaldo() - extrae * 1.3) > 0){
            super.setSaldo(super.getSaldo() - extrae * 1.3);
            System.out.println("Extracción realizada, su saldo ahora es de: "+ super.getSaldo());
        }else{
            System.out.println("Su saldo es insuficiente para realizar este retiro. Recuerde que se cobra el impuesto solidario de 30%");
        }
    }
}
