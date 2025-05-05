public class LabelledStm {
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        int count = 1;
        outerLoop:
            for(int i=1; i<=5; i++){
                    for(int j = 1; j<=5; j++){
//                        ans = isPrime(count);
                        if (isPrime(count)){
                            System.out.println();
                            System.out.print("The number is: "+ count + " and It's Position:"+ "row: "+ i+ " column "+ j);
                            break outerLoop;
                        }
                        System.out.print(count + " ");
                        count++;
                    }
                    System.out.println();
            }
    }

}
