import java.util.Scanner;

public class Dynamic2DArray {
    public static void main(String[] args){
        System.out.println("Enter the total number that you want to make array:");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        System.out.println("here is the factors you can select one: ");
        int sec;
        for(int i = 1; i<=total; i++){
            if (total%i==0){
                sec = total/i;
                System.out.println(i+ "*" + sec);
            }
        }
        System.out.println("enter row and column:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        while (row*col!= total){
            if(row*col != total) {
                System.out.println("Enter Right row and col");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }


        }

        System.out.println("now Enter numbers row wise....!");
        int[][] ar = new int[row][col];

        for(int i = 0; i<row;  i++){
            for(int j = 0; j<col; j++){
                ar[i][j] = scanner.nextInt();
            }
            if (i!=row-1){
                System.out.println("Enter next row:");
            }

        }
        System.out.println("your elements of array :");
        for(int i = 0; i < row; i ++){
            for(int j = 0; j<col; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
