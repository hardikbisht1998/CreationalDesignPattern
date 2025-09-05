package factory;

public class Watsapp implements MessageStream {
    @Override
    public String send() {
        System.out.println("Message Sent via Watsapp");
        return "recieved";
    }
}
