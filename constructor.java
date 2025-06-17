class Student{
    String name;
    int id;

  Student(String name,int id) {
        this.name=name;
        this.id=id;
        System.out.println("Construtor has Called");
    }
    Student(Student s){
        this.name=s.name;
        this.id=s.id;
    }
    
    
}
class Construtor{
    public static void main(String[] args) {
        Student s1=new Student("rupali",12);
         Student s2=new Student(s1);
        //s1.PrintInfo();
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s2.id);
        
    }
}