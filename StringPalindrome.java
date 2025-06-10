import java.util.Scanner;
 class StringPalindrome {
     public static void main(String[] args) {
    System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev = "";

        for(int i= s.length()-1;i>=0; i--)
        {
            rev=rev+s.charAt(i);

        }
       if(s.equals(rev)){
        System.out.println("String is Palindrome");
       }
       else{
        System.out.println("String is not Palindrome");
       }
    }
}
 