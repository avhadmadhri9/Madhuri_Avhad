public class palindrome {
    public static void main(String []args){
    int no=121;
    int temp=no;
    int rev=0;
    while(no>0){
        int rem=no%10;
        rev=rev*10+rem;
        no=no/10;
    }
    if(temp==rev)
    {
        System.out.println("Number is palindrome");
        
    }
    else{
         System.out.println("Number is not palindrome");
    }


    
}
}