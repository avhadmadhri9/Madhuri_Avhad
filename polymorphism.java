abstract class Animal {
    abstract void makeSound();
    abstract void slee();
    abstract void meoo();
    void sleep() { // Concrete method
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
    void slee(){
        System.err.println("hello");
    }
    void meoo(){
        System.out.println("hiee");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof
        dog.sleep();
        dog.slee(); // Output: Zzz...
        dog.meoo();
    }
}