package patrones.singleton;

public class Product {
    private String code;
    private String name;
    private Double price;

    public void setCode(String code){
        this.code = code;

    }

    public String getCode(){
        return  this.code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String code, String name, Double price, String owner) {
        this.code = code;
        this.name = name;
        this.price = price;
        System.out.println("Se creo el producto " + name + " con el codigo = " + code + "con un precio = " + price);
        Log.getInstance().add(owner + "Creo el producto con codigo "+ code +", nombre " +name + "con precio " + price);


    }
}
