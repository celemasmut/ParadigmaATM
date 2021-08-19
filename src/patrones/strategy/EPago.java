package patrones.strategy;

public class EPago extends Pago {
    @Override
    public void pagar(Double monto) {
        Double total =  monto * 1.005;
        System.out.println("usted pago con ePAgo :" + total);
    }

    @Override
    public void pedirDatos() {
// pido email
    }
}
