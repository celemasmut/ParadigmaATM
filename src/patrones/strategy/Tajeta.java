package patrones.strategy;

public class Tajeta extends Pago {
    @Override
    public void pagar(Double monto){
        Double total =  monto * 1.01;
        System.out.println("usted pago con tarjeta :" + total);
    }

    @Override
    public void pedirDatos() {
     //pedir numero de tarjeta
    }
}
