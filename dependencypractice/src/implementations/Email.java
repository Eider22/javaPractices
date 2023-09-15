package implementations;

import contracts.IEnviable;

public class Email implements IEnviable{

    @Override
    public void sendMessage() {
       System.out.println("Enviando mensaje por correo");
    }
    
}
