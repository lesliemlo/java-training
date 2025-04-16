package main.java.extra.practice;

public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] source){
        this.contacts = new Contact[source.length];

        for(int i=0; i<source.length; i++){
            this.contacts[i] = new Contact(source[i]);
        }
    }

    public Contact getContact(int index){
        return new Contact(this.contacts[index]);
    }

    public void setContact(Contact contact, int index){
        this.contacts[index] = new Contact(contact);
    }
}
