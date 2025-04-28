public class BitwiseOperator {
    public static void main(String[] args){
        int num1 = 12, num2 = 8;
        System.out.println("num1 "+ num1 + ": "+ Integer.toBinaryString(num1));
        System.out.println("num2 "+ num2 + ": "+ Integer.toBinaryString(num2));
        int ans = num1&num2;
        System.out.println("ans & bitwise operator:" + ans);
        System.out.println(Integer.toBinaryString(ans));
        //12 : 1100
        //8  : 1000
        //And  : 1000

        int ans2 = num1|num2;
        System.out.println("ans2 | bitwise operator:" + ans2);
        System.out.println(Integer.toBinaryString(ans2));
        //12 : 1100
        //8  : 1000
        //Or   : 1100

        int a = 7;
        int notA = ~a;
        System.out.println(notA+ " and "+ Integer.toBinaryString(notA));

        //xor = 1100 ^ 1000 ==> 0100
        int xorAns = num1^num2;
        System.out.println(xorAns +" and "+ Integer.toBinaryString(xorAns));

        int leftshift = a<<1;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(leftshift);
        System.out.println(Integer.toBinaryString(leftshift));
        int b = -5;
        int rightshift = b>>2;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(rightshift);
        System.out.println(Integer.toBinaryString(rightshift));

        int unsignedrightshift = b>>>1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(unsignedrightshift);
        System.out.println(Integer.toBinaryString(unsignedrightshift));

    }
}
