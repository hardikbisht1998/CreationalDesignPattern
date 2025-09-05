package factory;

public class Discord implements MessageStream {

    @Override
    public String send() {
        System.out.println("Message send via Discord");

        return "recieved";
    }
}
