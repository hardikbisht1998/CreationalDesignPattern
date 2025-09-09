import abstractFactory.BuildCharacter;
import abstractFactory.DarkPunkCharacter;
import prototype.AnimalHusbandry;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
//        int i=1;
//        if(i==1){
//            Reviewer reviewer=new Reviewer();
//            reviewer.execute();
//        }else{
//            System.out.println("Try Again");
//        }

//        BuildCharacter buildCharacter=new BuildCharacter(new DarkPunkCharacter());
//        buildCharacter.showSetting();

        AnimalHusbandry animalHusbandry=new AnimalHusbandry();
        animalHusbandry.add();
        animalHusbandry.status();

    }
}