public class IFELSE {
    public static void AgeAdult(int n){
        if(n>=18){
            System.out.println("Adult boys and girls for voting");
        }
        else{
            System.out.println("Not eligilable boys and girls for voting ");
        }
    }
    public static void main(String[] args) {
        int n=23;
        AgeAdult(n);
    }
}
