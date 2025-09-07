package abstractFactory;

public class BuildCharacter {
    Weapon weapon;

    SoundEffect soundEffect;
    Character character;
   public BuildCharacter(Character character){
       this.character=character;
   }


    public void showSetting(){


        soundEffect=character.createMusic();
        weapon=character.createSword();
        weapon.damage();
        weapon.lvl();
        soundEffect.fightingSound();
        soundEffect.walkingSound();
    }


}
