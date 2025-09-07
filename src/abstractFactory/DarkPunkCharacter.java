package abstractFactory;

public class DarkPunkCharacter implements Character{
    @Override
    public SoundEffect createMusic() {
        return new TechnoSoundEffect();
    }

    @Override
    public Weapon createSword() {
        return new SplitFireSniperWeapon();
    }
}
