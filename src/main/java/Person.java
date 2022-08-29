import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(PersonBuilder personBuilder) {
        this.name = PersonBuilder.name;
        this.surname = PersonBuilder.surname;
        this.age = PersonBuilder.age;
        this.address = PersonBuilder.address;
    }

    public void happyBirthday() {
        this.age = age + 1;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAge() {
        return (getAge().getAsInt() > 0);
    }

    public boolean hasAddress() {
        return (getAddress() != null);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAge(5);
    }

    @Override
    public String toString() {
        return name +
                " " + surname +
                ", age - " + age +
                ", address - " + address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}