import java.util.ArrayList;

public class FindMinMaxAvg {
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

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        double avg = (double) sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}