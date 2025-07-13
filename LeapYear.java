public class LeapYear {
    public static void LeapYearCheck(int n){
        if(n%4==0 && n%100!=0){
            System.out.println("Leap Year : "+n);
        }
        else if(n%400==0){
            System.out.println("Leap Year : "+n);
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
    public static void main(String[] args) {
        int n=2024;
        LeapYearCheck(n);
    
    }
    
}
