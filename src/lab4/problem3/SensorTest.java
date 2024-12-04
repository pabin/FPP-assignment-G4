package lab4.problem3;

public class SensorTest {
    public static void main(String[] args) {
        Sensor sensor0 = new SoundSensor();
        Sensor sensor1 = new LightSensor();
        Sensor sensor2 = new TemparatureSensor();
        Sensor sensor3 = new SoundSensor();
        Sensor sensor4 = new LightSensor();
        int N = 5;
        Sensor[] sensors = new Sensor[N];
        sensors[0] = sensor0;
        sensors[1] = sensor1;
        sensors[2] = sensor2;
        sensors[3] = sensor3;
        sensors[4] = sensor4;

        for(Sensor sensor: sensors) {
            System.out.println("*********************************************************");
          String sensorOperation = "Sensor Type: " + sensor.getSensorType() + "\n" +
                     "Reading: " + sensor.getReading() + "\n" +
                     "Location: " + sensor.getLocation() + "\n" +
                     "Last Updated: " + sensor.getLastUpdated() + "\n" +
                     "Action: " + sensor.performAction();
            System.out.println(sensorOperation);
        }

    }
}
