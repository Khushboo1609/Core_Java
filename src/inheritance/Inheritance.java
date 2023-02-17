/*Single level inheritance
  Increases code reusability as we have created name and account variable only once instead of creating them separately
  for Manager and developer class.
  More over by using subclass reference object one can access member of both subclass and super class
  but by using super class reference one can access only superclass members
 */


package inheritance;
 class Employee {
     String name;
     int account;
}
 class Manager extends Employee{
     int salary;
     Manager(String name,int account,int salary)
     {
         this.name=name;
         this.account=account;
         this.salary=salary;

     }


}
class Developer extends Employee{
     int salary;
    Developer(String name,int account,int salary)
    {
        this.name=name;
        this.account=account;
        this.salary=salary;

    }


}

public class Inheritance{
     public static void main(String [] args)
     {
         Manager a=new Manager("Ritu",222000134,200000000);
         System.out.println(a.name+ "," + a.account + "," + a.salary);
         Developer d=new Developer("muskan",44444411,30000000);
     }

}