import java.util.ArrayList;

public class Book {
    private int ID;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    public Book(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }
    public void addReview(Review review){
    this.reviews.add(review);
    }
    public String toString() {
        return String.format("id: %d,name: %s,author: %s,reviews: [%s]",ID,name,author,reviews);
    }
}
