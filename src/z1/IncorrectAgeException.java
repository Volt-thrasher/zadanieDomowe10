package z1;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException (){
        super("Wiek nie moze byc mniejszy od 1");
    }
}
