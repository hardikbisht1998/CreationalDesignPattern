package factory;

public class Email implements MessageStream {
    @Override
    public String send() {
        System.out.println("Message send via Email");
        return "recieved";
    }
}
