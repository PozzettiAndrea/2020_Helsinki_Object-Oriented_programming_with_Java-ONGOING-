
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song song1 = new Song("Ismo Leikola", "Pendolino", 194);
        Song song2 = new Song("Ismo Leikola", "Pendolino", 194);
        if(song1.equals(song2)) {
            System.out.println("Same!");
        }
    }
}
