package builder;

public class Laptop {

    private int ram;
    private int graphicCard;
    private String proccessor;
    private String operatingSystem;
    private String color;
    private String display;

    private Laptop(LaptopBuilder laptopBuilder) {
        this.color=laptopBuilder.color;
        this.graphicCard= laptopBuilder.graphicCard;
        this.operatingSystem= laptopBuilder.operatingSystem;
        this.display= laptopBuilder.display;
        this.ram=laptopBuilder.ram;
        this.proccessor=laptopBuilder.proccessor;

    }

    public String getColor() {
        return color;
    }

    public String getDisplay() {
        return display;
    }

    public int getRam() {
        return ram;
    }

    public int getGraphicCard() {
        return graphicCard;
    }

    public String getProccessor() {
        return proccessor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    static class LaptopBuilder {
        private int ram=4;
        private int graphicCard=1;
        private String proccessor="AMD";
        private String operatingSystem="LINUX";
        private String color="BLACK";
        private String display="OLED";

        private LaptopBuilder(){

        }

        public static LaptopBuilder builder(){
            return new LaptopBuilder();
        }



        public LaptopBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setGraphicCard(int graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public LaptopBuilder setProccessor(String proccessor) {
            this.proccessor = proccessor;
            return this;
        }

        public LaptopBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public LaptopBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public LaptopBuilder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);

        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", graphicCard=" + graphicCard +
                ", proccessor='" + proccessor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
