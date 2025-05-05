import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = scanner.nextInt();
        OuterLoop:
            for(int i = 1; i<=row; i++){
                for(int j = 1; j<=i; j++){
                    if(j==(i-1)){
                        System.out.println();
                        continue OuterLoop;
                    }
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
