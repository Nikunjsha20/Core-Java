import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter row to print a type of pattern of numbers :");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for(int i = 1; i<= row; i++){
            for(int j = 5; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // in one loop Approach but for fix row
        for(int i= 54321; i>=1; ){
           System.out.println(i);
           i /=10;
        }
        scanner.close();
    }
}

/* Example:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
