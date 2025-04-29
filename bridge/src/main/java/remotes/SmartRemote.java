package remotes;

import devices.Device;
import devices.SmartTv;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice Control Activated: " + command);

        if (command.equalsIgnoreCase("turn on")) {
            device.enable();
        } else if (command.equalsIgnoreCase("turn off")) {
            device.disable();
        } else if (command.equalsIgnoreCase("volume up")) {
            device.setVolume(device.getVolume() + 10);
        } else if (command.equalsIgnoreCase("volume down")) {
            device.setVolume(device.getVolume() - 10);
        } else if (command.startsWith("set channel ")) {
            try {
                int channel = Integer.parseInt(command.substring(12));
                device.setChannel(channel);
            } catch (NumberFormatException e) {
                System.out.println("Invalid channel number.");
            }
        } else if (device instanceof SmartTv && command.equalsIgnoreCase("browse internet")) {
            ((SmartTv) device).browseInternet();
        } else {
            System.out.println("Unknown voice command.");
        }
    }
}
