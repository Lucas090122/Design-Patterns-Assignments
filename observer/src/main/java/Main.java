public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver("Observer 1");
        WeatherObserver observer2 = new WeatherObserver("Observer 2");

        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);

        // Start the weather station
        new Thread(() -> weatherStation.start()).start();

        new Thread(() -> {
            try {
                Thread.sleep(10000);
                System.out.println("===> Removing Observer 1...");
                weatherStation.removeObserver(observer1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
