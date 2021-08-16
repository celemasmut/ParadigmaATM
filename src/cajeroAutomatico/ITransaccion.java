package cajeroAutomatico;

public interface ITransaccion {

    void depositarValor(Double deposita, TipoMoneda moneda);

    void extraerDinero(Double extrae);
}
