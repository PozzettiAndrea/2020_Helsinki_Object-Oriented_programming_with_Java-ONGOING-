
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Book book) {
        if (this.name.equals(book.name) && this.publicationYear == book.publicationYear) {
            return true;
        } else {
            return false;
        }
    }
}
