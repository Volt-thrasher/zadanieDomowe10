package z1;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age)
            throws NameUndefinedException, IncorrectAgeException {
        checkPreconditions(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException{
        this.firstName = firstName;
        if (firstName==null ||firstName.length()<2){
            throw new NameUndefinedException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        this.lastName = lastName;
        if (lastName==null||lastName.length()<2){
            throw new NameUndefinedException();
        }
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;
        if (age<1){
            throw new IncorrectAgeException();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkPreconditions(String firstName, String lastName, int age)
            throws NameUndefinedException, IncorrectAgeException {
        if (firstName==null || lastName==null||firstName.length()<2||lastName.length()<2){
            throw new NameUndefinedException();
        }
        if (age<1){
            throw new IncorrectAgeException();
        }
    }

}
