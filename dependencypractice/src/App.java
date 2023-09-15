import contracts.IEnviable;
import implementations.Email;
import implementations.Whatsapp;
import models.Client;
import models.Product;

public class App {
    public static void main(String[] args) throws Exception {

        IEnviable whatpp = new Whatsapp();
        IEnviable email = new Email();

        SaleControl salesControl = new SaleControl(email);


        Product product = new Product("Burbuja", 500);
        Client client = new Client("Juliana", "juliana@gmail.com");
        
        salesControl.makeSale(product, client);
    }
}
