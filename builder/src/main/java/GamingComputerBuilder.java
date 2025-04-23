public class GamingComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public GamingComputerBuilder() {
        // Default values for a gaming computer
        this.processor = "Intel i7";
        this.ram = 32;
        this.hardDrive = "1TB SSD";
        this.graphicsCard = "NVIDIA RTX 3070";
        this.operatingSystem = "Windows 10";
    }

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public ComputerBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, ram, hardDrive, graphicsCard, operatingSystem);
    }
}
