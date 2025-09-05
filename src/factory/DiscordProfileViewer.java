package factory;

public class DiscordProfileViewer extends ProfileViewer {

    @Override
    MessageStream notifies() {
        return new Discord();
    }
}
