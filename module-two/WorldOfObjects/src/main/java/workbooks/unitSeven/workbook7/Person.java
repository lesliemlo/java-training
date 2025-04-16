package main.java.workbooks.unitSeven.workbook7;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person person){
        this.name = person.name;
        this.nationality = person.nationality;
        this.dateOfBirth = person.dateOfBirth;
        this.seatNumber = person.seatNumber;
        this.passport = Arrays.copyOf(person.passport, person.passport.length);
    }

    public boolean applyPassport(){
        int number = (int)(Math.random()*2);

        return number == 1;
    }

    public void chooseSeat(){
        this.seatNumber = (int)(Math.random()*11+1);
    }
   public String getName(){
        return this.name;
   }
   public void setName(String name){
        this.name = name;
   }
   public String getNationality(){
        return this.nationality;
   }
   public void setNationality(String nationality){
        this.nationality = nationality;
   }
   public String getDateOfBirth(){
        return this.dateOfBirth;
   }
   public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
   }
   public String[] getPassport(){
        return Arrays.copyOf(this.passport,this.passport.length);
   }
   public void setPassport(){
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
   }
   public int getSeatNumber(){
        return this.seatNumber;
   }
   public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
   }
   public String toString(){
        return "Name: " + this.name + "\n"
                + "Nationality: " + this.nationality + "\n"
                + "Date of Birth: " + this.dateOfBirth + "\n"
                + "Passport: " + Arrays.toString(this.passport) + "\n"
                + "Seat Number: " + this.seatNumber + "\n";
   }
}
