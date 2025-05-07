import java.util.Scanner;

public class ProductOf2DMatrices {
    public static void main(String[] args) {
        System.out.println("Enter your 2D array row and column Sizes...:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first matrix row and column:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        System.out.print("Enter Second matrix row and column:");
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();
        while (col != row2) {
            System.out.println("Can not multiply if column of first matrix and row of second matrix are not same..");
            System.out.println("please Enter valid matrix Dimension");
            System.out.print("Enter first matrix row and column:");
            row = scanner.nextInt();
            col = scanner.nextInt();

            System.out.print("Enter Second matrix row and column:");
            row2 = scanner.nextInt();
            col2 = scanner.nextInt();
        }

        int[][] ar1 = new int[row][col];
        int[][] ar2 = new int[row2][col2];

        System.out.println("Now Enter"+ row*col + "numbers of First matrix....!");
        for(int i = 0; i<row;  i++){
            for(int j = 0; j<col; j++) {
                ar1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Now Enter"+ row2*col2 + "numbers of Second matrix....!");
        for(int i = 0; i<row2;  i++){
            for(int j = 0; j<col2; j++) {
                ar2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[row][col2];
        for(int i = 0; i<row; i++){
            for(int j =0; j<col2; j++){
                for(int k= 0; k<col;k++){
                    result[i][j] += ar1[i][k] *ar2[k][j];
                }
            }
        }


        for(int i = 0; i<row;  i++){
            for(int j = 0; j<col2; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
