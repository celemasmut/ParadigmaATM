package cajeroAutomatico;

public class CajadeAhorroPesos extends CuentaBancaria{

    public CajadeAhorroPesos(Double saldo, String cbu,TipoMoneda tipoMoneda){

        super(saldo,cbu,tipoMoneda);

    }


    public void mostrarSaldo(){
        System.out.println("Tu saldo de Caja de ahorro en pesos es de " + super.getSaldo());
    }

    @Override
    public void depositarValor(Double deposita, TipoMoneda moneda) {

        if(moneda.equals(getTipoDeMoneda())){
            super.setSaldo(super.getSaldo() + deposita);
        }else{
            System.out.println("Error en el tipo de moneda");
        }
    }

    @Override
    public void extraerDinero(Double extrae) {
            if((super.getSaldo() - extrae) > 0){
                super.setSaldo(super.getSaldo()-extrae);
                System.out.println("Extracción realizada, su saldo ahora es de : "+ super.getSaldo());
            }else{
                System.out.println("Su saldo es insuficiente para realizar este retiro");
            }
        }


}
