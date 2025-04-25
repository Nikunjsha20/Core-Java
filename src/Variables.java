public class Variables {
    static int num = 30; // Static variable
    int num2 = 20; //Instance variable
    public static void main(String [] args){
        int num3= 10;
        System.out.println("this is local variable num: " + num3);
        // to fetch non static variable/ Instance variable we have to create obj..!!
        Variables obj = new Variables();
        System.out.println("This is Instance Variable: " + obj.num2);

        // Now Fetch the Static variable By using class name as a reference..!!
        System.out.println("This is static variable num: " + Variables.num);

    }

}
