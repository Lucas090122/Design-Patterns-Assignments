public class ComputerDirector {
    private ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructDefault() {
        return builder.build(); // If builder has default config
    }

    public Computer constructCustom(String cpu, int ram, String hdd, String gpu, String os) {
        return builder
                .setProcessor(cpu)
                .setRam(ram)
                .setHardDrive(hdd)
                .setGraphicsCard(gpu)
                .setOperatingSystem(os)
                .build();
    }
}
