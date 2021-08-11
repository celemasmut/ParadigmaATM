package animal;

public class Main {
    public static void main(String[] args) {

        Perro Alex = new Perro();
        Alex.setEdad(7);
        Alex.setNombre("Alex");
        Alex.setColor("tricolor");
        Alex.setRaza("Beagle");
        Alex.setTamanio("Mediano");
        Alex.comer();
        Alex.dormir();
        System.out.println(Alex.toString());
    }
}
