package prototype;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AnimalRegistration {
    private Map<String,Animal> standard=new HashMap<>();

    public AnimalRegistration(){
        EnglishLop englishLop=new EnglishLop();
        englishLop.type=Type.RABBIT;
        englishLop.age=1;
        englishLop.name="masterKia";
        englishLop.lastCheckUp=new Date(2,12,1);
        englishLop.protienWeight =34;

        SilkieChicken silkieChicken=new SilkieChicken();
        silkieChicken.age=1;
        silkieChicken.type=Type.CHICKEN;
        silkieChicken.name="LordSen";
        silkieChicken.lastCheckUp=new Date(2,12,2);
        silkieChicken.protienWeight=30;

        standard.put(silkieChicken.breed, silkieChicken);
        standard.put(englishLop.breed, englishLop);

    }

    public Animal get(String key){
        return standard.get(key).clone();
    }

    public Animal put(String key,Animal animal){
        standard.put(key,animal);
        return animal;
    }


}
