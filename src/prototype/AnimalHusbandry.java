package prototype;

import java.util.ArrayList;
import java.util.List;

public class AnimalHusbandry {

    List<Animal> stocks = new ArrayList<Animal>();

    AnimalRegistration animalRegistration=new AnimalRegistration();

    public void add() {
        Animal animal1=animalRegistration.get("EnglishLop");
        Animal animal2=animalRegistration.get("SilkieChicken");
        Animal animal3=animalRegistration.get("SilkieChicken");
        stocks.add(animal3);
        stocks.add(animal1);
        stocks.add(animal2);

        if (animal1 != animal2 && !animal1.equals(animal2)) {
            System.out.println("EnglishLop != SilkieChicken (yay!)");
        } else {
            System.out.println("EnglishLop == SilkieChicken (booo!)");
        }

        if (animal2 != animal3) {
            System.out.println("SilkieChicken are two different objects (yay!)");
            if (animal2.equals(animal3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("SilkieChicken objects are the same (booo!)");
        }

    }


    public void status(){
        System.out.println("Farm Status: ");
        for(Animal i :stocks){
            System.out.println(i.type);
        }
    }

}