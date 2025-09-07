package abstractFactory;

public class RustySoundEffect implements SoundEffect{
    @Override
    public void walkingSound() {
        System.out.println("Walking Sound:  chcccccccccccccccc chcccccccccccccc");
    }

    @Override
    public void fightingSound() {
        System.out.println("Fighting Sound:  clink clink :)");

    }
}
