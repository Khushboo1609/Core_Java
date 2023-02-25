package instaceblock;
class InstaceC{
    InstaceC(){
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
class InstanceContext {
    public static void main(String[] args) {
        InstaceC a=new InstaceC();
    }
}
//O/P: m1-a ib-q a-con
//instance method is executed on calling and instance variable and block execute as per the order of code
//after that constructor will be  executed