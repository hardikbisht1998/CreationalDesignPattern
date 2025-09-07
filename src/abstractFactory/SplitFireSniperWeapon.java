package abstractFactory;

public class SplitFireSniperWeapon implements Weapon{
    @Override
    public void damage() {
        System.out.println("Damage : "+0.88);
    }

    @Override
    public void lvl() {
        System.out.println("Level :"+1);
    }
}
