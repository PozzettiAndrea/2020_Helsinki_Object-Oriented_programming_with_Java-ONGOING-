
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("First name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String lname = scanner.nextLine();
            System.out.println("Identification number: ");
            String idnum = scanner.nextLine();
            PersonalInformation PRZ = new PersonalInformation(name,lname,idnum);
            infoCollection.add(PRZ);            
        }
        for (PersonalInformation Perz:infoCollection) {
            System.out.println(Perz.getFirstName() + " " + Perz.getLastName());
        }
    }
}
