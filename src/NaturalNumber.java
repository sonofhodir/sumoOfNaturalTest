public class NaturalNumber {

    //have to return long in case if Integer.MAX_VALUE is passed
    public static long sumOfNatural(int n){
        long sum = 0;
        for(int i =1; i < n; i++){
            if(i%3 == 0 || i% 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
