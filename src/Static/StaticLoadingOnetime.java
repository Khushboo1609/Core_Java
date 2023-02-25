package Static;


class Sta1{
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
public class StaticLoadingOnetime {
    public static void main(String[] args) {
        Sta1 s1=new Sta1();
        Sta1 s2=new Sta1();
    }

}//o/p:sb-a m1-a
//for the  reference variable jvm will load byte code of class Sta1 and before executing constructor it will execute
//static context and after that execute cpnstructor


//when jvm encouter the same class constructor again it will first check whether the respective class is loaded or not,
// if it was already loaded jvm will not load it again and hence donot execute static context again but it will execute
//instance context and constructor again.