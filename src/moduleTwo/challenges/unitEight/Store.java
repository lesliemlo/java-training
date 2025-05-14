package moduleTwo.challenges.unitEight;

import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store(){
        this.books = new ArrayList<>();
    }

    public Book getBook(int index){
        return new Book(this.books.get(index));
    }

    public void setBook(Book book, int index){
        new Book(this.books.set(index, book));
    }

    public void addBook(Book book){
        this.books.add(new Book(book));
    }

    public boolean contains(Book book){
        return this.books.contains(book);
    }

    public void sellBook(String title){
        this.books.removeIf(book -> book.getTitle().equals(title));
    }
}
