public class LearnString {
        static String str="\t";
        public static void main(String[] arsg)
        {
            String s="Hello World";
            String s2 = "Hello World";
            String s1=new String("Hello World");

            if(s==s2)//== references
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }

            if(s.equals(s2))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }

            if(s==s1)//== references
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }

            if(s.equals(s1))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            System.out.println("equalsIgnoreCase : "+s.equalsIgnoreCase(s1));
            System.out.println("Length : "+s.length());
            System.out.println("str empty: " +str.isEmpty());
            System.out.println("str blank: " +str.isBlank());
            System.out.println("Value of s : "+s);
            System.out.println("Value used for compare World");
            //s=Hello
            //s1=World
            //s.compareTo(s1)
            //H-W
            //72-87
            //-15
            System.out.println("s compareTo : "+s.compareTo("World"));
            System.out.println("s compareToIgnoreCase : "+s.compareToIgnoreCase("World"));
            char ch='A';
            int ascii=(int)ch;
            System.out.println("ascii of char : "+ascii);
            int data=49;
            System.out.println("ascii of int : "+(char)data);
            for (int i = 0; i <= 127; i++)
            {
                System.out.printf("%d %c\n", i, (char) i);
            }
            //charAt
            char ch1=s.charAt(8);//Hello World
            System.out.println(ch1);
            System.out.println(s.codePointAt(8));//returns the unicode of the character of the specified index
            //Searching functions
            System.out.println(s.indexOf("J"));// returns the index of first occurence
            System.out.println(s.lastIndexOf("J"));//returns the last index of the found pattern
            System.out.println(s.contains("World"));
            System.out.println(s.startsWith("H"));
            System.out.println(s.endsWith("d"));
            //modifying functions
            System.out.println("Modifying Functions");
            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());
            System.out.println(s.trim());
            System.out.println(s.concat(" To Programming"));
            s=s.concat(" To Programming");
            //int a=10;
            //a+=2;=>a=a+2;
            System.out.println("The value of s :");
            System.out.println(s);
            System.out.println(s.replace("l","L"));
            System.out.println(s.replaceAll("l","L"));
            System.out.println(s.repeat(3));
            String output=String.join("#",s,s1);
            System.out.println(output);
            String inputString="apple banana orange";
            System.out.println(inputString.replace("apple","orange"));
            System.out.println(inputString.replaceAll("a.*?e","fruit"));
            //Splitting and Substring
            String arr[]=inputString.split(" ");
            for(String d:arr)
            {
                System.out.println(d);
            }
            char[] ar=inputString.toCharArray();
            for(char value : ar)
            {
                System.out.print(value+",");
            }
            String myData="Programming-In-Java";
            System.out.println("\n"+myData.substring(10));//g-In-Java
            System.out.println(myData.substring(10, 15));//g-In- // 10 to 14

            String val1="123";
            String val2="456";
            System.out.println(val1+val2);

            int i=123;
            int j=456;
            System.out.println(i+j);
            //int to String
            val1=String.valueOf(i);
            val2=String.valueOf(j);
            System.out.println(val1+val2);
        }
}

