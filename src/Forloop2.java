public class Forloop2 {
    public static void main(String [] args){
        // not going inside loop/ no any iteration..
        int i;
        for(i=1; i<1; i++){
            System.out.println(i);
        }
        System.out.println(i);
        //infinite loop just for understand just comment break statement for trying infinite loop
        int j;
        for(j=1; j>=1; j++){
            System.out.println("loop :"+ j);
        }
        // it will run until not interrupted by keyboard and OutOfMemoryError..!!
    }
}

