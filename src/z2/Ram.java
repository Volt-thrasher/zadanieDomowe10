package z2;

public class Ram extends Device {
    private double frequency;
    private double temperature;
    private double memory;
    private static double LIMIT_TEMPERATURE=80;

    public Ram(String model, String producer, String number,
               double frequency, double temperature, double memory) {
        super(model, producer, number);
        this.memory = memory;
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

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public void increaseFrequency(double increase) {
        setTemperature(getTemperature()+increase/100*15);
        setFrequency(getFrequency()+increase);
        if (getTemperature()>LIMIT_TEMPERATURE){
            throw new LimitTemperatureExceededException();
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                " memory=" + memory +
                '}';
    }
}
