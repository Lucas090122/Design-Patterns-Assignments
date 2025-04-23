public class Computer {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public Computer(String processor, int ram, String hardDrive, String graphicsCard, String operatingSystem) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer with " +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", operatingSystem='" + operatingSystem + '\'';
    }
}
