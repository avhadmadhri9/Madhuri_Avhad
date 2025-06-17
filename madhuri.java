
class madhuri{
    void add(int a, int b){
        System.out.println("constructo");
    }
    void add(double a,double b){
        System.out.println("cons");
    }
}
class demo{
    public static void main(String[] args) {
        madhuri m=new madhuri();
        m.add(12, 12);
        m.add(1.2, 2.3);
    }
}