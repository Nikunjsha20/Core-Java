import java.util.Scanner;

public class StrCountRepetition {
    public static void main(String[] args){

        System.out.println("Enter a String for Count repetition Char: ");
        Scanner scanner = new Scanner(System.in);
        String InputString = scanner.nextLine();
        String result = compressString(InputString);
        System.out.println("Result Output is: " + result);

    }

    public static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String OutputString = "" + s.charAt(0);
//        char ch1, ch2;
        int count = 1;
        for (int i = 1; i < (s.length()); i++) {
//            ch1 = s.charAt(i);
//            ch2 = OutputString.charAt(i-1);
            if (s.charAt(i)==(s.charAt(i-1))){
                count += 1;
            }
            else{
                OutputString += String.valueOf(count) + s.charAt(i);
                count = 1;
            }
        }
//        System.out.println(count);

        return OutputString + String.valueOf(count);

    }

}
