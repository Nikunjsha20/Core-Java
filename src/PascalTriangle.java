import java.util.Scanner;

public class PascalTriangle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number to Print PascalTriangle: ");
        int row = scanner.nextInt();

        for(int i=0;i<row;i++)
        {
            //printing the spaces
            for(int s=0;s<row-i-1;s++)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();

        }
    }

}