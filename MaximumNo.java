import java.util.Scanner;
public class MaximumNo {
    
    public static void main(String[] args) {
        System.out.println("Enter a Number1");
        Scanner s=new Scanner(System.in);
       int n1= s.nextInt();
         System.out.println("Enter a Number2");
        int n2=s.nextInt();
         System.out.println("Enter a Number3");
       int n3= s.nextInt();
        if(n1>n2 && n1>n3){
          System.out.println("Number 1 is graeter");
        }
        
        else if(n2>n1 && n2>n3){
            System.out.println("Number 2 is greater");

        }
        else
        {
            System.out.println("Number 3 is greater");
        }
    }

    }
    

