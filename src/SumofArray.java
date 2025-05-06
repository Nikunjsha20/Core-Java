import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args){
        int[] ar = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 7 numbers to Find Sum of all number: ");
        for(int i = 0; i<7; i++){
            ar[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0; i<7;i++){
            sum += ar[i];
        }
        System.out.println("The Sum of all 7 numbers: "+ sum);
        scanner.close();
    }
}
