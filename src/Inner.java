

class Outer {
    int i=10;
    void m1()
    {
        System.out.println("m1_0");
    }

    class Inner {
        int j=20;
        void m2()
        {
            System.out.println("m2_i");
        }
    }
}
class T{
    public static void main(String[] args) {
        Outer o=new Outer();
        System.out.println(o.i);
        o.m1();
        Outer.Inner ref=new Outer().new Inner();
        ref.m2();
    }


}
