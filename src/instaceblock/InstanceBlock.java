package instaceblock;

class Instance{
    {
        System.out.println("ib-a");
    }
    Instance()
    {
        System.out.println("A-con");
    }
    {
        System.out.println("ib-a1");
    }
}


class InstanceBlock {
    public static void main(String[] args) {
        Instance2 i=new Instance2();
    }
}
//o/p:ib-a
//ib-a1
//A-con
//instance block are executed before constructor