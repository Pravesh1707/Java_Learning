package oops;
//Method Overridding
public class Polymorphism {
    void fun(){
        System.out.println("Polymorphism only fun without parameter" );

    }
    void fun(int a){
        System.out.println("Polymorphism");
        // return a;
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.fun(3);
    }
}
