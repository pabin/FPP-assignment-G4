package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{

    private double soundLevel;

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundLevel;
    }

    @Override
    public String getLocation() {
        return "Bedroom";
    }

    @Override
    public String getLastUpdated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return LocalDateTime.now().format(formatter);
    }

    @Override
    public String performAction() {
        if(soundLevel >= 70)
            return "An alert to turn on noise cancellation";
        return "Sound is within normal range";
    }
}
