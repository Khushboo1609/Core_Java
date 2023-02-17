package mutable;
class Mutable {
    public static void main(String [] args)
    {
      String a=new String ("Durga")  ;
      String b=a.concat("soft");
        System.out.println(a);        //o/p:Durga
        System.out.println(b);        //o/p:DurgaSoft
        StringBuffer a1=new StringBuffer ("Durga")  ;
        StringBuffer b1=a1.append("soft");
        System.out.println(a1);       //o/p:DurgaSoft
        System.out.println(b1);       //o/p:DurgaSoft

    }


}
