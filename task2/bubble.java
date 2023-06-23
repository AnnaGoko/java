import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        FileWriter fw = new FileWriter("log.txt");
        
        for(int i = 0; i < arr.length - 1; i++) {
          for(int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j] > arr[j+1]) {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
          fw.write(Arrays.toString(arr) + "\n");
        }
        
        fw.close();
    }
}