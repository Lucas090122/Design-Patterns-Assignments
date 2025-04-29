import devices.Device;
import devices.Radio;
import devices.Tv;
import devices.SmartTv;
import remotes.AdvancedRemote;
import remotes.BasicRemote;
import remotes.SmartRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testSmartDevice(new SmartTv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

    public static void testSmartDevice(Device device) {
        System.out.println("Tests with smart remote on SmartTv.");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power(); // Turn on
        device.printStatus();

        smartRemote.voiceControl("browse internet");
        smartRemote.voiceControl("volume up");
        smartRemote.voiceControl("set channel 5");
        device.printStatus();

        smartRemote.voiceControl("turn off");
        device.printStatus();
    }
}
