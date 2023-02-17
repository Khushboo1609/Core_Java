/* to achieve run time polymorphism - Overriding*/
/*overriding is not possible for final and private  methods*/
package inheritance;

class A {
    void m1()
    {
        System.out.println("m1");
    }

}
 class B extends A{
    @Override
    void m1()
     {
         System.out.println("m2");
     }

}
public class Overridding {
    public static void main(String[] args) {
       B b=new B();
       b.m1();
        A a = new A();
        a.m1();

    }
}
