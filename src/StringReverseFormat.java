import java.util.Locale;
import java.util.Scanner;

public class StringReverseFormat {
    public static void main(String[] args){
        System.out.println("Enter a String for Count repetition Char: ");
        Scanner scanner = new Scanner(System.in);
        String InputString = scanner.nextLine();
        String result = ReverseFormatting(InputString);
        System.out.println("Result Output is: " + result);
    }

    public static String ReverseFormatting(String s){
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] arstr = s.trim().split(" ");
        String result = "";

        for(int i = arstr.length-1; i>=0; i--){
            String word = arstr[i].toLowerCase();
            if(!word.isEmpty()){
                String Capitalize = word.substring(0,1).toUpperCase().concat(word.substring(1));
                result = result.concat(Capitalize);
                if(i!=0){
                    result = result.concat(" ");
                }

            }
        }

        return  result;

//        for(int i = 0 ; i<OutputString.length();  i++){
//            String s1  = String.valueOf(OutputString.charAt(i));
//            if (s1.equals(" ")){
//                result = sbpart + result;
//                sbpart = "";
//
//            }
//            else{
//                sbpart = s1 + sbpart;
//            }
//        }

    }
}
