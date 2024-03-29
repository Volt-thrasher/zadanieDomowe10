package z2;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP",new Processor("Core i7",
                "Intel","123456",
                2700,35), new Ram("DDR3","HP","12457",
                2200,45,256),
                new HardDisc("SSD","AMD","13579"));

        try {
            computer.getProcessor().increaseFrequency(200);
            computer.getRam().increaseFrequency(100);
            System.out.println(computer);

            computer.getProcessor().increaseFrequency(500);
            computer.getRam().increaseFrequency(300);
            System.out.println(computer);

            computer.getProcessor().increaseFrequency(500);
            computer.getRam().increaseFrequency(300);
            System.out.println(computer);
        }catch (LimitTemperatureExceededException e){
            System.out.println(e.getMessage());
        }
    }
}
