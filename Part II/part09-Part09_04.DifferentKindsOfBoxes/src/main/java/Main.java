

public class Main {

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();
        box.add(new Item("a",1));
        System.out.println(box.isInBox(new Item("a",1)));
    }
}
