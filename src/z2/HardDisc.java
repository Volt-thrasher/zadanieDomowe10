package z2;

public class HardDisc {
    private String model;
    private String producer;
    private String number;
    private int volume;

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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", number='" + number + '\'' +
                ", volume=" + volume +
                '}';
    }

    public HardDisc(String model, String producer, String number, int volume) {
        this.model = model;
        this.producer = producer;
        this.volume = volume;
        this.number = number;
    }
}
