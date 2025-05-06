import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        int[] ar = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers to reverse elements: ");
        for(int i = 0; i<5; i++){
            ar[i] = scanner.nextInt();
        }

        for(int i = 4; i>=0; i--){
            System.out.print(ar[i]+ ",");
        }
        scanner.close();
    }
}
