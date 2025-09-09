import abstractFactory.BuildCharacter;
import abstractFactory.DarkPunkCharacter;
import prototype.AnimalHusbandry;
import singleton.CheckerSingleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
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

        CheckerSingleton checkerSingleton=new CheckerSingleton();
        checkerSingleton.check();

    }
}