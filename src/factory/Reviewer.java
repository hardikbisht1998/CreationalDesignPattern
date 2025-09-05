package factory;

import java.util.Objects;

public class Reviewer {
    String type = "Discord";
    ProfileViewer profileViewer;

    public void execute() {

        if (Objects.equals(type, "Discord")) {
            profileViewer = new DiscordProfileViewer();
        } else if (Objects.equals(type, "email")) {
            profileViewer = new EmailProfileViewer();
        } else {
            profileViewer = new WatsappProfileViewer();
        }
        profileViewer.resumeStatics();
    }




}
