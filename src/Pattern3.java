import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        System.out.println("Enter row number to print third Pattern of triangle:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int count = 1;
        for (int i= 1; i <= row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
        scanner.close();

    }


}

