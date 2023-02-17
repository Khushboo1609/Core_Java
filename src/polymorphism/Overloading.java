package polymorphism;

 class Overloading {
    int sum(int a,int b)
    {
       return (a+b) ;
    }
    float sum(float a,float b)
    {
        return (a+b) ;
    }
    String sum(String a,String b)
    {
        return (a+b) ;
    }
}
 class Loading{
     public static void main(String[] args)
     {
         Overloading a=new Overloading();
         System.out.println(a.sum(2,3));
         Overloading a1=new Overloading();
         System.out.println(a1.sum("best","school"));
         Overloading a2=new Overloading();
         System.out.println(a1.sum(2f,3f));
     }


}
