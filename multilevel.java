class Madhuri {
    void a() {
        System.out.println("Hello Madhuri");
    }
}

class Rupali extends Madhuri {
    void b() {
        System.out.println("How are you");
    }
}

class Vedantika extends Rupali {
    void c() {
        System.out.println("What to do");
    }
}

class Shradha extends Vedantika {
    void d() {
        System.out.println("Who are you");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Shradha s = new Shradha();
        Vedantika v = new Vedantika();
        Rupali r = new Rupali();

        s.d();  // Shradha
        s.c();  // Vedantika
        s.b();  // Rupali
        s.a();  // Madhuri

        v.c();  // Vedantika
        v.b();  // Rupali
        v.a();  // Madhuri

        r.b();  // Rupali
        r.a();  // Madhuri
    }
}
