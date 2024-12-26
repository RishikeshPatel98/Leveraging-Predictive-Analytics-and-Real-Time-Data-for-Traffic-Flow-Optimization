import java.util.HashMap;
import java.util.Map;

public class Data {
    private Map<String, Integer> trafficVolume; // Key: Road ID, Value: Traffic Volume
    private Map<String, Double> averageSpeed;  // Key: Road ID, Value: Average Speed

    public Data() {
        trafficVolume = new HashMap<>();
        averageSpeed = new HashMap<>();
    }

    public void addTrafficVolume(String roadId, int volume) {
        trafficVolume.put(roadId, volume);
    }

    public void addAverageSpeed(String roadId, double speed) {
        averageSpeed.put(roadId, speed);
    }

    public int getTrafficVolume(String roadId) {
        return trafficVolume.getOrDefault(roadId, 0);
    }

    public double getAverageSpeed(String roadId) {
        return averageSpeed.getOrDefault(roadId, 0.0);
    }

    public Map<String, Integer> getAllTrafficVolumes() {
        return trafficVolume;
    }

    public Map<String, Double> getAllAverageSpeeds() {
        return averageSpeed;
    }

    @Override
    public String toString() {
        return "Data{" +
                "trafficVolume=" + trafficVolume +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
