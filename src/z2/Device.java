package z2;

public abstract class Device {
    private String model;
    private String producer;
    private String number;


    public Device(String model, String producer, String number) {
        this.model = model;
        this.producer = producer;
        this.number = number;
    }

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

    @Override
    public String toString() {
        return  "model: '" + model + '\'' +
                ", producer: '" + producer + '\'' +
                ", number: '" + number + '\'';
    }

    public void increaseFrequency(double increase) {

    }



}
