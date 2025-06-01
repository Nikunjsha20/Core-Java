public class Comparison {
    public static void main(String[] args){
        long startTime, endTime;
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=10000; i++){
            sb.append("A");
        }
        endTime= System.nanoTime();
        System.out.println("Time Taken by StringBuilder:"+ (endTime-startTime));
        startTime = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();

        for(int i = 0; i<=10000; i++){
            sb1.append("A");
        }

        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer:"+ (endTime-startTime));
    }
}

