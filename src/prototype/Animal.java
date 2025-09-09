package prototype;

public abstract class Animal {
    private int farmId = 109;
    public Type type;

    public Animal() {

    }

    public abstract Animal clone();

    public Animal(Animal target) {
        if (target != null) {
            this.farmId = target.farmId;
            this.type = target.type;

        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {

            return this.farmId == ((Animal) obj).farmId && this.type == ((Animal) obj).type;
        }
        return false;
    }
}

