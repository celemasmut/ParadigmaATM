package animal;

public class Perro {
    private String nombre;
    private String tamanio ;
    private int edad;
    private String color;
    private String raza;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void comer(){
        System.out.println(nombre + " Estoy comiendo");

    }
    public void dormir(){
        System.out.println(nombre +" Estoy durmiendo");
    }
    public void sentarse(){
        System.out.println(nombre + " Estoy sentado");

    }
    public void correr(){

        System.out.println(nombre +" Estoy corriendo");
    }

    @Override
    public String toString() {
        return  "Nombre='" + nombre + '\'' +
                "tamaño='" + tamanio + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
