import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private double temperature;
    private double initialTemperature;
    private Random random;
    private static final int MAX_TEMPERATURE = 40; // Maximum temperature
    private static final int MIN_TEMPERATURE = -10; // Minimum temperature

    public WeatherStation() {
        observers = new ArrayList<>();
        random = new Random();
        initialTemperature = (int) (MIN_TEMPERATURE + (MAX_TEMPERATURE - MIN_TEMPERATURE) * random.nextFloat()); // Initial temperature
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Temperature updated to " + temperature + "°C");
        }
    }

    public void setWeatherData(double temperature) {
        this.temperature = temperature;
    }

    public void start() {
        System.out.println("Weather Station started with initial temperature: " + initialTemperature + "°C");
        random = new Random();
        setWeatherData(initialTemperature);
        // Simulate temperature changes
        while (true) {
            temperature = temperature + random.nextInt(2) * 2 - 1; // Random temperature change
            setWeatherData(temperature);
            notifyObservers();
            try {
                Thread.sleep(1000 + random.nextInt(4000)); // Sleep for 1-5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
