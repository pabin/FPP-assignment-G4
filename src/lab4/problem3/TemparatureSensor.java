package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{

    private double temperature;

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return "Living Room";
    }

    @Override
    public String getLastUpdated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return LocalDateTime.now().format(formatter);
    }

    @Override
    public String performAction() {
        if(temperature >= 30)
            return "“An alert to turn on the AC";
        return "Temperature is in normal range";
    }
}
