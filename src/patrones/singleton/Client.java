package patrones.singleton;


public class Client {

    private String code;
    private String name;
    private String lastName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Client(String code, String name, String lastName, String owner){
        this.code = code;
        this.name = name;
        this.lastName = lastName;

        System.out.println("Se creo el cliente "+ name+" "+lastName);
        Log.getInstance().add(owner + "Creo el cliente con codigo "+ code +", nombre " +name + "con apellido " + lastName);

    }
}
