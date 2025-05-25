public class StringBuilderBuffer {
    public static void main(String args[])
    {/*
        String is immutable : String is unchangeable
        StringBuilder :                                               StringBuffer  :
        not Thread-safe                                               Thread - safe
        java 5                                                        java 1.0
        java.lang                                                     java.lang




        */

         String str="Hello";//SCP
         str="World";
         System.out.println(str);

        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append(" To Java String Programming");
        System.out.println(sb);
        System.out.println(sb.capacity());// newcapacity=(oldcapacity*2)+2;
        System.out.println(sb.length());
        sb.ensureCapacity(200);
        System.out.println(sb.capacity());

        StringBuilder sb1=new StringBuilder(200);
        System.out.println("sb1 capacity : "+sb1.capacity());

    }
}
