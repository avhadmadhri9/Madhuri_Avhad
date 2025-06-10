public class Overriding {
    public void sound()
    {
        System.out.println("Dog makes sound");

    }
    public void bark()
    {
        System.out.println("Dog barks");
    }

}
 class Overriding1 extends Overriding{
    public void sound(){
        System.out.println("Dog make sound from overriding method");
        
    }
    public static void main(String[] args) {
        Overriding1 o=new Overriding1();
        o.sound();
        o.bark();
    }
    }

 

    