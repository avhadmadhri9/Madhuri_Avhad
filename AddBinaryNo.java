import java.util.Scanner;
public class AddBinaryNo {
    public static void main(String[] args) {
        System.out.println("enter a 1st binary no");
        Scanner s=new Scanner(System.in);
        String b1=s.nextLine();
        System.out.println("enter a 2nd binary no");
        String b2=s.nextLine();
        int num1=Integer.parseInt(b1);
        int num2=Integer.parseInt(b2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        System.out.println("Sum of two Binary nubers:"+result);
    }

    
}
