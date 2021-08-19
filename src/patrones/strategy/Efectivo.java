package patrones.strategy;

public class Efectivo extends Pago {
    @Override
    public void pagar(Double monto) {
        System.out.println( "Usted pago: " + monto);
    }

    @Override
    public void pedirDatos() {

    }
}
