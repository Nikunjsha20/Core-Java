import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter row number to print kind of Pattern:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int count = 0;
        for(int i=1; i <= row; i++){
//            for(int j = 1; j <=row-i; j++){
//                System.out.println("  ");
//            }
            count++;
            for(int j= 1; j<=row; j++){
                if (j>=row-i+1){
                    System.out.print(count+ " ");
                    count++;
                }
                else{
                    System.out.print("  ");
                }
            }
            count--;
            for(int j = 1; j<i; j++){

                System.out.print(--count + " ");

            }
            System.out.println();
        }
        scanner.close();

    }
}
