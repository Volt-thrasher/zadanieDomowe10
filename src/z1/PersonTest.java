package z1;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Person person = new Person(input.nextLine(), input.nextLine(), input.nextLine(), input.nextInt());
            System.out.println(person);
        }catch (NameUndefinedException |IncorrectAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
