import java.util.Scanner;

public class HillPattern {
    public static void main(String [] args){
//        System.out.println("Enter row number:");
//        Scanner scanner = new Scanner(System.in);
//        int row = scanner.nextInt();
        int num = 17;
        int j;
        for(int i = 1; i<=3; i++){
            for(j = 1; j<=17;j++){
                if((i+j)%4==0 || (i==2 && j%4==0)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}
