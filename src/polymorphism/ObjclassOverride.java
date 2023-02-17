package polymorphism;
class Student{
    int roll;
    String  subject;
    Student(int roll,String subject)
    {
        this.roll=roll;
        this.subject=subject;
    }
    //@Override
     public String toString(){
        return  (roll +""+ subject);

    }

}

 class ObjclassOverride {
     public static void main(String[] args)
     {
         Student s1=new Student(23,"Khushi");
         System.out.println(s1.toString());
         System.out.println(s1.roll +""+s1.subject);
     }

}
