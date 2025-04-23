package moduleTwo.extraPractice.unitSeven;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact (String name, String phoneNumber, String birthDate){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }
    public Contact (Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public int getAge(){
        return toAge(this.birthDate);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
        setAge(this.birthDate);
    }
    private void setAge(String birthDate){
        this.age = toAge(birthDate);
    }

    public int toAge(String birthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formattedBirthDate = LocalDate.parse(birthDate,formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(formattedBirthDate,currentDate);
        return period.getYears();
    }

    public String toString(){
        return "Name: " + this.name + "\n" +
                "Phone number: " + this.phoneNumber + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Age: " + this.age + " years old\n";
    }
}
