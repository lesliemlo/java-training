package moduleTwo.challenges.unitEight;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double rating;
    private double price;

    public Book(String title, String author, double rating, double price){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }

    public Book(Book source){
        this.title = source.title;
        this.author = source.author;
        this.rating = source.rating;
        this.price = source.price;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getRating(){
        return this.rating;
    }

    public double getPrice(){
        return this.price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(rating, book.rating) == 0 && Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, rating, price);
    }
}
