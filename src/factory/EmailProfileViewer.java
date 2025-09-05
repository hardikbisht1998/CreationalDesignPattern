package factory;

public class EmailProfileViewer extends ProfileViewer{
    @Override
    MessageStream notifies() {
        return new Email();
    }
}
