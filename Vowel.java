import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter a any letter to check letter is vowel or not");
        Scanner s=new Scanner(System.in);
        char v=s.next().charAt(0);
        if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
            System.out.println("It is a Vowel");

        }
        else{
            System.out.println("It is a consonent");
        }
        }

    }

