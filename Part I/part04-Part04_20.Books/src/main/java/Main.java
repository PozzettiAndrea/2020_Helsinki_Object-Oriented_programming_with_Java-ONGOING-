import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("publicationYear: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book newbook = new Book(title,pages,publicationYear);
            infoCollection.add(newbook);            
        }
        System.out.println("\nWhat information will be printed?");
        String whatinfo = scanner.nextLine();
        if (whatinfo.equals("name")) {
            for (Book book:infoCollection) {
                System.out.println(book.getTitle());
            }
        } else if (whatinfo.equals("everything")) {
            for (Book book:infoCollection) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages" + ", " + book.getPublicationYear());
            }
        }
        

    }
}
