
// creo una classe Person
public class Person {
    private String firstName;
    private String secondName;
    private Integer age;
    private String address;
    // nel costruttore di Person inizializzo un tipo PerosonBuilder per richiamare la classe
    public Person(PersonBuilder personBuilder) {
        //nei this. richiamo personbuilder.get che va a riprendere i getter della classe PersonBuilder
        this.firstName = personBuilder.getFirstName();
        this.secondName = personBuilder.getSecondName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();

    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    // faccio override toString
    @Override
    public String toString() {
        return "Person{" +
                "firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", age = " + age +
                ", address = '" + address + '\'' +
                '}';
    }
}
