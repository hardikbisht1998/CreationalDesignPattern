package factory;

public abstract class ProfileViewer {

    abstract MessageStream notifies();

    void resumeStatics(){
        //take resume callculate statistic and send the notification on particular stream regarding we recieved the profile

        MessageStream messageStream=notifies();
        messageStream.send();
    }
}
