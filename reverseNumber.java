public class reverseNumber {
    public static int ReverNum(int n){
        int rev =0;
        while (n > 0) {
           int last=n%10;
           rev=rev*10+last;
           n=n/10; 
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(ReverNum(n));
    }
}
