package moduleTwo.workbooks.unitSeven;

public class Airline {
    private Person[] people;

    public Airline(){
        this.people = new Person[11];
    }

    public Person getPerson(int index){
        Person person = this.people[index];
        return new Person(person); //copy of the person object
    }
    public void setPeople(Person person){
        people[(person.getSeatNumber()-1)] = new Person(person);
    }
    public void createReservation(Person person) {
        int index = person.getSeatNumber() - 1; // since seat numbers can range from 1 - 11, whereas the index ranges from 0 - 10.

        while(people[index] != null){
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber()
                    + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
            index = person.getSeatNumber() - 1;
        }
        people[index] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }
}
