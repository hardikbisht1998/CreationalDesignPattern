package builder;

public class CheckerBuilder {

    public void check(){
        Laptop laptop=  Laptop.LaptopBuilder.builder().setColor("blue").setGraphicCard(234)
                .setOperatingSystem("windows").build();

        System.out.println(LaptopDirector.gamingLaptop().toString());
    }
}
