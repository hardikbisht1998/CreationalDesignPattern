package prototype;

import java.util.Date;

public class EnglishLop extends Animal {
    public String name;
    public String breed = "EnglishLop";
    public int age;
    public int protienWeight;
    public Date lastCheckUp;

    public EnglishLop() {
    }

    public EnglishLop(EnglishLop target) {
        super(target);
        if (target != null) {
            this.breed = target.breed;
            this.age = target.age;
            this.protienWeight = target.protienWeight;
            this.lastCheckUp = target.lastCheckUp;

        }

    }


    @Override
    public Animal clone() {
        return new EnglishLop(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EnglishLop) || !super.equals(obj)) return false;
        EnglishLop englishLop= (EnglishLop) obj;
        return englishLop.name==this.name && englishLop.breed==this.breed && this.protienWeight ==englishLop.protienWeight;
    }
}
