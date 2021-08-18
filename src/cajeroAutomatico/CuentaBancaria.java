package cajeroAutomatico;

abstract class CuentaBancaria implements ITransaccion{
    private Double saldo;
    private String cbu;
    private TipoMoneda tipoDeMoneda;

    public CuentaBancaria(Double saldo, String cbu, TipoMoneda tipoDeMoneda) {
        this.saldo = saldo;
        this.cbu =cbu;
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public TipoMoneda getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void setTipoDeMoneda(TipoMoneda tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public void mostrarSaldo(){
        System.out.println("Tu saldo es " + saldo);
    }
    

    public int mostrarOpciones(){
        System.out.println("Seleccione la opcion a retirar");
        System.out.println("1 - $5000");
        System.out.println("2 - $10000");
        System.out.println("3 - $20000");
        System.out.println("4 - $50000");
        System.out.println("5 - $100000");
        System.out.println("6 - o puede ingresar el valor que desee retirar");
        return 6;
    }
    
    public int opcionDeMoneda(){
        System.out.println("Seleccione la moneda que desea");
        System.out.println("1 - Pesos");
        System.out.println("2 - Dolar");
        return 2;
    }

    public Double opcionesARetirar(int opcion){
        Double montoElegido=0.0;
        switch (opcion){
            case 1:
                montoElegido=5000.00;
                break;
            case 2:
                montoElegido = 10000.00;
                break;
            case 3:
                montoElegido = 20000.00;
                break;
            case 4:
                montoElegido = 50000.00;
                break;
            case 5:
                montoElegido = 100000.00;
                break;
        }
        return montoElegido;
    }

    public CuentaBancaria getInstance(){
        return this;
    }

}
