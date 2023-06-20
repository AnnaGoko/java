import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел равна: " + sum);
    }
}