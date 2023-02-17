package innerClass;

class OuterClass{

    void second(){
        System.out.println("Outer");

    }
    class Inner{


        void first(){
            System.out.println("Inner");

        }

    }

    static class StaticInner{
        void third(){
            System.out.println("Static Inner");

        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.Inner oi= new OuterClass().new Inner();
        OuterClass.StaticInner soi= new OuterClass.StaticInner();
        soi.third();

    }
}
