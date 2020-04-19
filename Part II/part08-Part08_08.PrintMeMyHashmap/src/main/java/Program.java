
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String stringy:hashmap.keySet()){
            System.out.println(stringy);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String stringy:hashmap.keySet()){
            if (stringy.contains(text)) {
                System.out.println(stringy);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String stringy:hashmap.keySet()){
            if (stringy.contains(text)) {
                System.out.println(hashmap.get(stringy));
            }
        }
    }
}
