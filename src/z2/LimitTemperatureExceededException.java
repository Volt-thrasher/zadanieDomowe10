package z2;

public class LimitTemperatureExceededException extends RuntimeException {
    public LimitTemperatureExceededException() {
        super("Przekroczono bezpieczna temperature!");
    }
}
