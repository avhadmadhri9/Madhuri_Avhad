
//avoid duplication
//reusability
//extends ability you can add new features in exixting class
//polymorphism it enable runtime polymorphism via method ovverriding 
//code maintane easier to manage and update 

public class inheritance {
    void show(){
        System.out.print("parent class");
    }
    
}
class property extends inheritance{
    void show1(){
        System.out.println("child class");

    }
}

class demo{
    public static void main(String[] args) {
        property p1=new property();
        p1.show1();
        p1.show();
     
    }
}
