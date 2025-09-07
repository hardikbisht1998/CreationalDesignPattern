package abstractFactory;

public class CrosbowWeapon implements Weapon{
    @Override
    public void damage() {
        System.out.println("Damage :"+0.23);
    }

    @Override
    public void lvl() {
        System.out.println("Level:  1");

    }
}
