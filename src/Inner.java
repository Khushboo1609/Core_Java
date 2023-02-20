

class MemberInner {
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
        MemberInner o=new MemberInner();
        System.out.println(o.i);
        o.m1();
        MemberInner.Inner ref=new MemberInner().new Inner();
        ref.m2();
    }


}
