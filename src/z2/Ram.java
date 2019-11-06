package z2;

public abstract class Ram extends Processor {
    private double memory;

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
    }

    public String toString() {
        return "Ram{" +
                "memory=" + memory +
                '}';
    }

    public Ram(String model, String producer, String number,
               double frequency, double temperature, double memory) {
        super(model, producer, number, frequency, temperature);
        this.memory = memory;
    }
}
