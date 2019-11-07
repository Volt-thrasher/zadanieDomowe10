package z2;

public class Processor extends Device {
    private double frequency;
    private double temperature;
    private static double LIMIT_TEMPERATURE=80;

    public Processor(String model, String producer, String number, double frequency, double temperature) {
        super(model, producer, number);
        this.frequency = frequency;
        this.temperature = temperature;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString()+" frequency: "+frequency+
                " temperature: "+temperature;
    }

    @Override
    public void increaseFrequency(double increase) {
        super.increaseFrequency(increase);
    }
}
