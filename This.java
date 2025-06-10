
 public class This{
        String name;
        int age;
void Display(){
            System.err.println(this.name);
             System.err.println(this.age);
        }
public static void main(String[] args) {
          This s=new This();
          s.name="supriya";
          s.age=19;
          s.Display();
      }

       }
   

