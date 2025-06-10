 class SingleLevel {
    public void print(){
        System.out.println("This is an parent class");
    }
}
class Child extends SingleLevel{

    public void display(){
        System.out.println("This is an child class");        
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.print();
        c.display();
    }
}
