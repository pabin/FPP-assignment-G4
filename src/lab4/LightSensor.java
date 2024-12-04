package lab4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{

    private double lightlevel;

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lightlevel;
    }

    @Override
    public String getLocation() {
        return "Garden";
    }

    @Override
    public String getLastUpdated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return LocalDateTime.now().format(formatter);
    }

    @Override
    public String performAction() {
        if(lightlevel <= 100)
            return "“an alert to turn on the light";
        return "Light is sufficient";
    }
}
