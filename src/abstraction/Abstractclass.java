package abstraction;
abstract class A{
    void m1(){
        System.out.println("m1");
    }
    abstract void m2();


}

class B extends A {
    void m2()
    {
        System.out.println("m2");
    }
    void m3()
    {
        System.out.println("m3");
    }
}

class Abstract {
    public static void main(String[] args)
    {
        A a=new B();//with reference variable of  A we can access  m1 and m2 method
        a.m1();
        a.m2();
        B b=new B();//with the reference variable of b we can access one extra method i.e m1,m2 & m3
        b.m1();
        b.m2();
        b.m3();

    }

}
