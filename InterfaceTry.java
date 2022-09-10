import java.util.ArrayList;

public class InterfaceTry {
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        b.add(1);
        a.add(2);
        b.add(2);
        System.out.println(a == b);
    }
}
