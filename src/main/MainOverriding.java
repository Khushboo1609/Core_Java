package main;

 class MainOverriding {
     public static void main(String[] args) {
         System.out.println("m1-a");
     }
}
class MainOverriding2 extends  MainOverriding {

        public static void main(String[] args) {
            System.out.println("m2-a");

    }
}
//when we execute super class o/p come from super class only not from subclass
//o/p:m1-a
