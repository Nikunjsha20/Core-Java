import java.util.Scanner;

public class StarPyramid {
    public static void main(String [] args){
        System.out.println("Enter row number..!");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for(int i= 1; i<=row; i++){
            for(int j= 1; j<=row-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i*2-1; j++){
                if(j==1 || j == i*2-1) {
                    System.out.print("* ");
                }
                else {
                    if (i == row) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
