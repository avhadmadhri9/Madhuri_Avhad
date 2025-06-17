interface  interfa {
  final int a = 10;
  void display();  
}
class TestClass implements interfa{
    public void display() {
    System.out.println("hello");
}
}
class hello
{
    public static void main(String[] args)
     {
     TestClass t = new TestClass();
     t.display();
     System.out.println(t.a);   
    }
}