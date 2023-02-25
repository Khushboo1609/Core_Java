package instaceblock;
class InstaceC2{
    InstaceC2(){
        System.out.println("a-con");
    }
    int i=m1();
    {
        System.out.println("ib-A");
    }
    int m1(){
        System.out.println("m1-a");
        return 10;
    }
}


class Instance2 {
    public static void main(String[] args) {
        InstaceC2 a=new  InstaceC2();
        InstaceC2 a1=new  InstaceC2();
    }

}
//o/p:m1-a ib-a a-con  m1-a ib-a a-con
//2 time object formation, 2 time execution of instance context