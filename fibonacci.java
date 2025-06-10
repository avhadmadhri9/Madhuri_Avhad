public class fibonacci {
    public static void main(String[] args){
        int no=10;
        int no1=0;
        int no2=1;
        System.err.println("Fibonacci Series of"+no);
        for(int i=0;i<=no;i++){
            System.err.println(no1);
               int next=no1+no2;
               no1=no2;
               no2=next;

        }
    }
}
