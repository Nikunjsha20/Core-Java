public class SCP
{
    // String
    public static void main(String args[])
    {
        String s1="Hello";// pool
        String s2="Hello";// pool
        String s3=new String("Hello");// stack Heap

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        //intern() : you can manually add the data into String constant pool...
        String s4=s3.intern();
        System.out.println("After using intern() : ");
        System.out.println(s1==s4);
        System.out.println(s2==s4);

        s2="World";
        System.out.println(s1==s2);

    }
}



/*
 *
 *
 *  String Constant Pool
 *                  s1         Hello
 *                  s2
 *
 *
 *
 */