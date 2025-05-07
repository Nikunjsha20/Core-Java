import java.util.Scanner;

public class Addition2DMatrices {
    public static void main(String[] args){
        System.out.println("Enter your 2D array row and column Sizes...:");
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] ar = new int[row][col];
        int[][] ar2 = new int[row][col];
        System.out.println("Enter elements of First 2D matrix:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j++){
                ar[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of Second 2D matrix:");
        for(int i = 0; i<row; i++){
            for(int j = 0 ; j<col; j++){
                ar2[i][j] = scanner.nextInt();
            }
        }

        //logic for sum of 2D matrices...
        int [][] resultarray = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++){
                resultarray[i][j] = ar[i][j]+ ar2[i][j];
                System.out.print(resultarray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

}
