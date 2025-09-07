package abstractFactory;

public class TechnoSoundEffect implements SoundEffect {

    @Override
    public void walkingSound() {
        System.out.println("Walking Sound : tink inki tinki");
    }

    @Override
    public void fightingSound() {
        System.out.println("Fighting Sound:  diskio diuskio");

    }
}
