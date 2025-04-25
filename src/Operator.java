import java.util.Scanner;
public class Operator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();
        System.out.println(".....Arithmetic ooperator.....");
        System.out.println("Sum of Given number: "+ (num1+num2)); //Addition operator
        System.out.println("Sub of Given number: "+ (num1-num2)); //substraction operator
        System.out.println("mul of Given number: "+ num1*num2); //Multiplication operator
        System.out.println("div of Given number: "+ (num1/num2)); //Division operator
        System.out.println("rem of Given number: "+ (num1%num2)); //modulo operator to find remainder

        System.out.println(".....\n \nAssignment and Arithmetic assignment operator.....");
        int num = 20; //Assignment operator =
        System.out.println("value of num: "+ num);
        num += 5;
        System.out.println("after using += 5 operator value of num:"+ num);
        num -= 10;
        System.out.println("after using -= 10 operator value of num:"+ num);
        num *= 2;
        System.out.println("after using *= 2 operator value of num:"+ num);
        num /= 5;
        System.out.println("after using /= 5 operator value of num:"+ num);
        num %= 4;
        System.out.println("after using %= 4 operator value of num:"+ num);

    }

}
