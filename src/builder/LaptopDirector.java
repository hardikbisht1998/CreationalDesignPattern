package builder;

public class LaptopDirector {

    public static Laptop gamingLaptop() {
        return Laptop.LaptopBuilder.builder()
                .setRam(16)
                .setGraphicCard(8)
                .setProccessor("Intel i9")
                .setOperatingSystem("Windows")
                .setDisplay("4K")
                .setColor("Black-Red")
                .build();
    }

    public static Laptop businessLaptop() {
        return Laptop.LaptopBuilder.builder()
                .setRam(8)
                .setProccessor("Intel i5")
                .setOperatingSystem("Windows Pro")
                .setDisplay("Full HD")
                .setColor("Silver")
                .build();
    }
}


