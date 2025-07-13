public class NaturalNumberPrint{
    public static void PrintNum(int n){
        int i=1;
        do{
          System.out.println(i);
          i++;
        }while(i<=n);
    }
    public static void main(String[] args) {
        int n=10;
        PrintNum(n);
    }
}