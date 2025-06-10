import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
       System.out.println("Enter a year to ckeck year is leap year or not"); 
       Scanner sc=new Scanner(System.in);
       int y=sc.nextInt();
       if(y%4==0){
        System.out.println("It is a Leap Year");
       }
       else{
        System.out.println("It is not a Leap Year");
       }
    }
    
}
