package abstractFactory;

public class MedievelCharacter implements Character{
    @Override
    public SoundEffect createMusic() {
        return new RustySoundEffect();
    }

    @Override
    public Weapon createSword() {
        return new CrosbowWeapon();
    }
}
