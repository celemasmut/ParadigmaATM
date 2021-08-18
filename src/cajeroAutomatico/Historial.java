package cajeroAutomatico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Historial {

    static List<String> movimientos= new ArrayList<>();
    private static Historial instancia;


    private Historial(){

    }

    public static Historial getInstance(){
        if(instancia == null){
            instancia = new Historial();
        }
        return instancia;
    }

    public void agregarMovimiento(LocalDate fecha, String movimiento, String laCuenta) {
        String nuevoMovimiento = fecha + ": " + movimiento + " en la cuenta: "+ laCuenta;
        movimientos.add(nuevoMovimiento);
    }

    public void mostrarMovimientos(){
        movimientos.forEach(movimiento -> System.out.println(movimiento.toString()));
    }
}
