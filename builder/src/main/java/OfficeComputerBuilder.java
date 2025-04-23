public class OfficeComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    public OfficeComputerBuilder() {
        // Default values for an office computer
        this.processor = "Intel i5";
        this.ram = 16;
        this.hardDrive = "512GB SSD";
        this.graphicsCard = "Integrated Graphics";
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
