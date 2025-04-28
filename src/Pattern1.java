import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        int i, j;
        System.out.println("Enter a number of row for print a type of triangle :");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (i=1; i<=row; i++){
            for (j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
/* Example:
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
