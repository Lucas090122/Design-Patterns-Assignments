import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // Build a gaming PC
        director.setBuilder(new GamingComputerBuilder());
        Computer gamingPC = director.constructDefault();
        System.out.println("\n=== Gaming PC ===\n" + gamingPC);

        // Build an office PC
        director.setBuilder(new OfficeComputerBuilder());
        Computer officePC = director.constructDefault();
        System.out.println("\n=== Office PC ===\n" + officePC);

        // Build a custom PC
        Scanner scanner = new Scanner(System.in);
        director.setBuilder(new GamingComputerBuilder());
        System.out.println("Welcome to the Custom PC Builder!");
        System.out.print("Enter Processor: ");
        String cpu = scanner.nextLine();

        System.out.print("Enter RAM size (in GB): ");
        int ram = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Hard Drive (e.g., '1 TB SSD'): ");
        String hdd = scanner.nextLine();

        System.out.print("Enter Graphics Card: ");
        String gpu = scanner.nextLine();

        System.out.print("Enter Operating System: ");
        String os = scanner.nextLine();

        Computer customPC = director.constructCustom(cpu, ram, hdd, gpu, os);

        System.out.println("\n=== Your Custom PC Configuration ===");
        System.out.println(customPC);
    }
}