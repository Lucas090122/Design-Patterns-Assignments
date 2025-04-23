public interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);

    ComputerBuilder setRam(int ram);

    ComputerBuilder setHardDrive(String hardDrive);

    ComputerBuilder setGraphicsCard(String graphicsCard);

    ComputerBuilder setOperatingSystem(String operatingSystem);

    Computer build();
}
