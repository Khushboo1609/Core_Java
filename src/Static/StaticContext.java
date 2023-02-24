package Static;
class Sta{
    static{
        System.out.println("sb-a");
    }
    static int i=m1();
    static int m1()
    {
        System.out.println("m1-a");
        return 10;
    }
}
class StaticContext {
    public static void main(String[] args) {
        Sta a=new Sta();  //loading Sta  class byte code to memory ,if there exist static context at the time of loading
    }                     //jvm will first recognise that and after that flow of execution will come to main memory
}
                          //o/p:sb-a    m1-a  and i is recognised as 10