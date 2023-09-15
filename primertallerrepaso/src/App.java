import puntodos.contracts.ICobrable;
import puntodos.implementations.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        ICobrable ejemplar = new Libro();
        System.out.println("Impuesto: " + ejemplar.impuesto());
        // ejemplar.mostrar();
    }
}
