public class ForLabelledMultiTable {
    public static void main(String [] args){
        OuterLoop:
            for(int i = 1; i<=5; i++){
                System.out.println("table of:"+ i);
                for(int j = 1; j<=10; j++){
                    if(i*j>12){
                        continue OuterLoop;
                    }
                    System.out.println(i*j);
                }
                System.out.println();
            }

    }
}
