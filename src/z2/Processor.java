package z2;

public class Processor {
    private String model;
    private String producer;
    private String number;
    private double frequency;
    private double temperature;
    private static double LIMIT_TEMPERATURE=80;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Processor(String model, String producer, String number, double frequency, double temperature) {
        this.model = model;
        this.producer = producer;
        this.number = number;
        this.frequency = frequency;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", number='" + number + '\'' +
                ", frequency=" + frequency +
                ", temperature=" + temperature +
                '}';
    }

    public void increaseFrequency(double increase) {
        frequency+=increase;
        temperature+=increase/10;
        if (temperature+increase/10>LIMIT_TEMPERATURE){
            throw new LimitTemperatureExceededException();
        }
    }



}
