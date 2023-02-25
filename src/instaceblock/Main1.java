package instaceblock;

class Main2 {
    public static void main(String[] args) {
        System.out.println("main2");
    }
}
class Main1 {
    public static void main(String[] args) {
        System.out.println("main1");
        String[] str={"aa","bb"};
        Main2.main(str);

    }
}
//duplicate method are not allowed in java so one cannot provide multiple main method in same class  but u can pro
//vide in different class
//o/p:main1 if you  exccute main1,main 2 if main 2 executed
//one can access main2 in main1 by treating main2 as static method along will passing string array as argument