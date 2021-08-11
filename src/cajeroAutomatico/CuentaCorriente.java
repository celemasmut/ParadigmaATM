package cajeroAutomatico;

public class CuentaCorriente extends CuentaBancaria{

    // saldo negativo
    private Double topeNegativo;

    public CuentaCorriente(Double saldo, String cbu, Double topeNegativo){

        super(saldo,cbu);
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
    }

    @Override
    public void extraerDinero(Double extrae){
        if((super.getSaldo() - extrae) >= topeNegativo){
            super.setSaldo(super.getSaldo() - extrae);
            System.out.println("Extracción realizada, su saldo ahora es de : "+ super.getSaldo());
        }else{
            System.out.println("Su saldo es insuficiente para realizar este retiro");
        }
    }
}
