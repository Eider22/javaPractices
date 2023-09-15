package implementations;

import contracts.IEnviable;

public class Whatsapp implements IEnviable {

    @Override
    public void sendMessage() {
        System.out.println("Enviando mensaje por whatsapp");
    }

}
