package prototype;

import java.util.Date;

public class SilkieChicken extends Animal {
    public String name;
    public String breed="SilkieChicken";
    public int age;
    public int protienWeight;
    public Date lastCheckUp;

    public SilkieChicken(SilkieChicken target) {
            super(target);
            if(target!=null){
                this.breed=target.breed;
                this.age=target.age;
                this.protienWeight = target.protienWeight;
                this.lastCheckUp=target.lastCheckUp;
            }


    }

    public SilkieChicken(){
    }

    @Override
    public Animal clone() {
        return new SilkieChicken(this);
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SilkieChicken) || !super.equals(obj)) return false;
        SilkieChicken silkieChicken= (SilkieChicken) obj;
        return silkieChicken.name==this.name && silkieChicken.breed==this.breed && this.protienWeight ==silkieChicken.protienWeight;
    }
}
