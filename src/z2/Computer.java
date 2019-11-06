package z2;

public class Computer {
    private String producer;
    private Processor processor;
    private Ram ram;
    private HardDisc hardDisc;

    public Computer(String producer, Processor processor, HardDisc hardDisc) {
        this.producer = producer;
        this.processor = processor;
        this.hardDisc = hardDisc;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", hardDisc=" + hardDisc +
                '}';
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }
}
