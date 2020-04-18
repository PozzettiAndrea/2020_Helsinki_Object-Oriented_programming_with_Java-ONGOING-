
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
    
    public String longest() {
        int longestindex = 0;
        if (elements.size()==0) {
            return null;
        } else {
            for (int i = 0; i<elements.size();i++) {
                if (elements.get(i).length() > elements.get(longestindex).length()) {
                    longestindex = i;
                }
            }
        }
        return elements.get(longestindex);
    }

}
