package moduleTwo.challenges.unitEight;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
//        Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
//        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);

       Store store = new Store();
       store.addBook(book1);
       store.addBook(book2);

       //test getBook method
        Book retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());

       //test setBook method
        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBook(newBook, 0);

       //verify the book was updated in index 0
        retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());

       //test contains method
        System.out.println(store.contains(book2));

       //test sellBook method
        store.sellBook("1984");
        System.out.println(store.contains(book2));
    }
}
