public class UnaryOperator {
    public static void main(String [] args){
        int num1 = 10, num2 = -20, num3 = 5;
        int result = (num1++) + (--num2)+ (++num3) - (+num3) + (num2--) + num1+num2+num3;
        System.out.println("Result of --> (num1++) + (--num2)+ (++num3) - (+num3) + (num2--) + num1+num2+num3 :"+result);
        int number = 10;
        System.out.println("number++ and number"+(number++)+" "+ number);
        System.out.println("++number and number"+(++number)+" "+ number);
        System.out.println("--number and number"+(--number)+" "+ number);
        System.out.println("number-- and number"+(number--)+" "+ number);
    }

}
