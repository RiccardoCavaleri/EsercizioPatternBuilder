public class PersonBuilder {
    private String firstName;
    private String secondName;
    private Integer age;
    private String address;

    //creo un costruttore dove non inizializzo nulla
    //nei this richiamo dei vaolri vuoti, nel caso l'utente non inserisca nulla
    PersonBuilder (){
        this.firstName = "Nome non inserito";
        this.secondName = "Cognome non inserito";
        this.age = 0;
        this.address = "Indirizzo non inserito";

    }
    // Richiamo i getter e i setter
    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
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
    //Creo un metodo build() di tipo Person che mi ritorna Person, inserisco this per richiamare se stesso
    public Person build(){
        return new Person(this);
    }
}
