import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        System.out.println("Enetr a no1");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("enter a no2");
        int b=s.nextInt();
        int q=a/b;
        System.out.println("Quotient is: "+q);
        float r=a%b;
        System.out.println("Remainder is: "+r);
        

    }
}
