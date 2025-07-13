public class SumOfNumber {
    public static int SumNatural(int n){
        if(n==0){
            return 0;
        }
        return n+SumNatural(n-1);
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(SumNatural(n));
    }
}