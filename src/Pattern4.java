import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number for print a pattern");
        int row = scanner.nextInt();
        int count = 1;
        for(int i=1; i <= row; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(count+""+(count*count)+ " ");
                count++;
            }
            System.out.println();
        }
        scanner.close();
    }

}
