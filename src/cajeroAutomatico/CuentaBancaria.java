package cajeroAutomatico;

abstract class CuentaBancaria {
    private Double saldo;
    private String cbu;

    public CuentaBancaria(Double saldo, String cbu) {
        this.saldo = saldo;
        this.cbu =cbu;
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

    public void depositarvalor (Double valorADepositar){
        saldo = saldo + valorADepositar;
        System.out.println("Tu nuevo saldo es de: "+saldo);
    }

    public int mostrarOpciones(){
        System.out.println("Seleccione la opcion a retirar");
        System.out.println("1 - $5000");
        System.out.println("2 - $10000");
        System.out.println("3 - $20000");
        System.out.println("4 - $50000");
        System.out.println("5 - $100000");
        return 5;
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

    public void extraerDinero( Double extrae){
        if((saldo - extrae) > 0){
            saldo-=extrae;
            System.out.println("Extracción realizada, su saldo ahora es de : "+ saldo);
        }else{
            System.out.println("Su saldo es insuficiente para realizar este retiro");
        }


    }
}
