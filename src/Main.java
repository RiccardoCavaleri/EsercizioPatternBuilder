public class Main {
    public static void main(String[] args) {

        PersonBuilder persona = new PersonBuilder();
        //costruisco una nuova persona con i set
        persona.setFirstName("Riccardo");
        persona.setSecondName("Cavaleri");
        persona.setAge(33);
        persona.setAddress("Via ciao 69");
        //salvo quello che ho costruito in una nuova variabiledi tipo Perona dove richiamo persona.build() per salavare tutti i parametri
        Person riccardo = persona.build();
        //Stampo a schermo
        System.out.println(riccardo);

        PersonBuilder persona2 = new PersonBuilder();
        persona2.setFirstName("Michele");
        persona2.setSecondName("Angeletti");

        Person michele = persona2.build();

        System.out.println(michele);

    }
}