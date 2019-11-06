package z1;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz dane osobowe: imie, nazwisko, pesel i wiek: ");
        try {
            Person person = new Person(input.nextLine(), input.nextLine(), input.nextLine(), input.nextInt());
            System.out.println(person);
        }catch (NameUndefinedException |IncorrectAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
