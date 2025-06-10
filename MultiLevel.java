public class MultiLevel {
    public void sound()
    {
        System.out.println("Animal makes sound");
    }
}
    class Dog extends MultiLevel{
        void bark()
        {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Dog{
        void sound1()
        {
            
            System.out.println("Cat makes meow");

        }
     public static void main(String[]args){
        Cat c=new Cat();
        c.sound();
        c.bark();
        c.sound1();
    }
    }