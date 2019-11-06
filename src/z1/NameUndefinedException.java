package z1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException () {
        super("Podaj imie i nazwisko. Dlugosc powinna byc nie mniejsza od dwoch znakow");
    }
}
