import java.util.Scanner;
/* Example:
1           1
1 2       2 1
1 2 3   3 2 1
1 2 3 4 3 2 1
1 2 3   3 2 1
1 2       2 1
1           1
 */
public class NumberDiamond {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row odd number of total row. more than should be 3");
        int row = scanner.nextInt();
        int n = row;
        for(int i =1; i<=(row/2)+1; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }

            for(int j = 1; j<= n-2 ; j++){
                System.out.print("  ");
            }
            n -= 2;

            for(int j = i; j >=1; j--){
                if(i == (row/2+1) && j == (row/2+1)  ){
                    continue;
                }
                System.out.print(j+ " ");
//                    System.out.print(i-j+1+ " ");
            }

            System.out.println();
        }
        int a = row - ((row/2)+1);
        int n1 = 1;
        for(int i = 1; i<=a; i++){
            for(int j =0; j<=a-i; j++){
                System.out.print(j+1+ " ");
            }

            for(int j = 1; j<=n1; j++){
                System.out.print("  ");
            }
            n1 += 2;

            for(int j = a-i+1; j>=1 ; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }

}
