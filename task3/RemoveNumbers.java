import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(7);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}