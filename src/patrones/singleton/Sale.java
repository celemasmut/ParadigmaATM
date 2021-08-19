package patrones.singleton;

import java.time.LocalDateTime;

public class Sale {


    private Product product;
    private Client client;
    private LocalDateTime date;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Sale (Product product, Client client, String owner){
        this.client = client;
        this.product = product;
        this.date = LocalDateTime.now();

        System.out.println("Se vendio el producto "+ product.getName()+ " al cliente "+client.getName());
        Log.getInstance().add(owner + "vendio "+ product.getCode() +", al cliente " +client.getName() + "con precio " + product.getPrice());

    }


}
