package z1;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException (){
        super("Wiek nie moze byc mniejszy od 1");
    }
}
