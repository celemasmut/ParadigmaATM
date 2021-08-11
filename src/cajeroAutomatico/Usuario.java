package cajeroAutomatico;

public class Usuario {
    private String nombre;
    private String contrasenia;
    private CajadeAhorroDolares misDolares;
    private  CajadeAhorroPesos misPesos;
    private CuentaCorriente miCuentaCorriente;

    public Usuario(String nombre, String contrasenia, CajadeAhorroDolares misDolares, CajadeAhorroPesos misPesos, CuentaCorriente miCuentaCorriente){
        this.nombre=nombre;
        this.contrasenia = contrasenia;
        this.misDolares = misDolares;
        this.miCuentaCorriente=miCuentaCorriente;
        this.misPesos=misPesos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public CajadeAhorroDolares getMisDolares() {
        return misDolares;
    }

    public void setMisDolares(CajadeAhorroDolares misDolares) {
        this.misDolares = misDolares;
    }

    public CajadeAhorroPesos getMisPesos() {
        return misPesos;
    }

    public void setMisPesos(CajadeAhorroPesos misPesos) {
        this.misPesos = misPesos;
    }

    public CuentaCorriente getMiCuentaCorriente() {
        return miCuentaCorriente;
    }

    public void setMiCuentaCorriente(CuentaCorriente miCuentaCorriente) {
        this.miCuentaCorriente = miCuentaCorriente;
    }
}
