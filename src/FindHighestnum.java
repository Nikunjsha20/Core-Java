import java.util.Scanner;

public class FindHighestnum {
    public static void main(String[] args){
        int[] ar = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers to Find Highest number: ");
        for(int i = 0; i<5; i++){
            ar[i] = scanner.nextInt();
        }
        int highest = ar[0];
        int pos = 1;
        for(int i = 1; i<5; i++){
            if(ar[i]>highest){
                highest = ar[i];
                pos = i+1;
            }
        }
        System.out.println("The highest number of given array: " +highest + "\nThe Position is: "+ pos);

        scanner.close();
    }
}
