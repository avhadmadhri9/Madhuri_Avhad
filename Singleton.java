public class Singleton {
    
    
    public String str;

    private static Singleton obj;

    private Singleton() {
        str = "I am a Singleton!";
    }

    public static Singleton getSingleInstance() {
        if (obj == null) {
            obj = new Singleton(); 
        }
        return obj;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();

        System.out.println(s1.str); 

        s1.str = "Changed text";

        System.out.println(s2.str); 
    }
}

    

