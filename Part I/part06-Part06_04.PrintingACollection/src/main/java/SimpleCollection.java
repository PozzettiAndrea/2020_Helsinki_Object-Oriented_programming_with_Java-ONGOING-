
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String toreturn;
        if (elements.isEmpty()) {
            toreturn = ("The collection "+this.name+" is empty.");
        } else {
            if (this.elements.size() == 1) {
                toreturn = "The collection "+this.name+" has " + this.elements.size() + " element:";
            } else {
                toreturn = "The collection "+this.name+" has " + this.elements.size() + " elements:";
            }
        }
        for (String elem:elements) {
            toreturn += "\n"+ elem;
        }
        return toreturn;
    }
    
}
