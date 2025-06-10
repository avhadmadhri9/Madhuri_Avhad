public class Overloading {
   public void display(int a){
     System.out.println("java");
    }
   public void display(int a,int b){
     System.out.println("C++");
    }
    public void display(double a,double b){
     System.err.println("C");
}
public static void main(String[] args) {
    Overloading o=new Overloading();
    o.display(10.0,4.6);

}
}
