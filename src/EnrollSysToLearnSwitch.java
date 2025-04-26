import java.util.Scanner;
public class EnrollSysToLearnSwitch {
    public static void main(String[] args){
    // University Enrollment System
    /*
     * 1) Total aggregate : 85<
     * 2) option 1) math(H) 2)C.S. 3) Eng(H)
     *              95          98      93
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your average aggregate of 10+2");
        double percentage = scanner.nextDouble();

        if (percentage>=85){
            System.out.println("You can Apply for the  below listed course");
            System.out.println("Press 1 : Math(H) \n Press 2 : C.S \n Press 3 Eng(H)");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: System.out.println("Enter marks of Math:");
                        int maths = scanner.nextInt();
                        if (maths>=95){
                            System.out.println("You are eligible for enrollment in maths..!!");
                        }
                        else{
                            System.out.println("You are not eligible for maths...!!");
                        }
                        break;
                case 2: System.out.println("Enter marks of CS:");
                    int cs = scanner.nextInt();
                    if (cs>=98){
                        System.out.println("You are eligible for enrollment in C.S..!!");
                    }
                    else{
                        System.out.println("You are not eligible for C.S...!!");
                    }
                    break;
                case 3: System.out.println("Enter marks of Eng:");
                        int eng = scanner.nextInt();
                        if (eng>=93){
                            System.out.println("You are eligible for enrollment in Eng..!!");
                        }
                        else{
                            System.out.println("You are not eligible for Eng...!!");
                        }
                        break;

                default: System.out.println("invalid choice Try again...!!");

            }
        }
        else{
            System.out.println("You are not Eligible for any course..!! minimum 85 aggregate need for enroll...!!");
        }

    }

}
