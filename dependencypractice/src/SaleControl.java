import contracts.IEnviable;
import models.Client;
import models.Product;

public class SaleControl {

    IEnviable enviable;

    public SaleControl(IEnviable enviable) {
        this.enviable = enviable;
    }

    public void makeSale(Product product, Client client) {

        System.out.println("Se vendio el producto " + product.getName() + " con un\n"
                + " precio de " + product.getPrice() + " al cliente " + client.getName());

        notify(client);

    }

    public void notify(Client client) {
        this.enviable.sendMessage();
    }
}
