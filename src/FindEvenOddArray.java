import java.util.Scanner;

public class FindEvenOddArray {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers to Find even odd elements: ");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        //Count the even and Odd numbers
        int even=0, odd= 0;
        for(int i = 0; i<10; i++){
            if (num[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even + " "+ odd);
        int[] evennum = new int[even];
        int[] oddnum = new int[odd];
        int j = 0, k=0;
        for(int i = 0; i<num.length; i++){
            if(num[i]%2==0){
                evennum[j]= num[i];
                j++;
            }
            else{
                oddnum[k]= num[i];
                k++;

            }
        }

        System.out.print("Even number are :");
        for(int i = 0; i<evennum.length; i++){
            System.out.print(evennum[i]+ " ");
        }
        System.out.print("Odd number are :");
        for(int i = 0; i<oddnum.length; i++){
            System.out.print(oddnum[i]+ " ");
        }
    }
}
