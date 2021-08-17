package cajeroAutomatico;

public class CuentaCorriente extends CuentaBancaria{

    // saldo negativo
    private Double topeNegativo;

    public CuentaCorriente(Double saldo, String cbu, Double topeNegativo,TipoMoneda tipoMoneda){

        super(saldo,cbu,tipoMoneda);
        this.topeNegativo=topeNegativo;
    }

    public Double getTopeNegativo() {
        return topeNegativo;
    }

    public void setTopeNegativo(Double topeNegativo) {
        this.topeNegativo = topeNegativo;
    }



    public void mostrarSaldo(){

        System.out.println("Tu saldo de cuenta corriente es de: " + super.getSaldo());
        System.out.println("Tu tope a retirar es de : $" + getTopeNegativo());
    }

    @Override
    public void depositarValor(Double deposita, TipoMoneda moneda) {
        if(moneda.equals(getTipoDeMoneda())){
            super.setSaldo(getSaldo() - deposita);
        } else {
            System.out.println("Error en el tipo de moneda.");
        }
    }

    //la extracción de Cuenta corriente tiene una comisión de 0.3%
    @Override
    public void extraerDinero(Double extrae) {
        double totalDebitado= extrae * 1.3;
        if ((super.getSaldo() - totalDebitado) >= topeNegativo) {
            super.setSaldo(super.getSaldo() - totalDebitado);
            System.out.println("Extracción realizada");
            System.out.println("Su comision por la extraccion es del 0.3, su saldo en la cuenta es de : $"+super.getSaldo());
        } else {
            System.out.println("Su saldo es insuficiente para realizar este retiro");
        }
    }
}
