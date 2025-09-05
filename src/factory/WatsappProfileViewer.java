package factory;

public class WatsappProfileViewer extends ProfileViewer{
    @Override
    MessageStream notifies() {
        return new Watsapp();
    }
}
