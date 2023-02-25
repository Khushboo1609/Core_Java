package main;

class MainOverloading {
    public static void main(String[] args) {
        System.out.println("String-main()-a");

    }

    public static void main(int[] args) {
        System.out.println("int-main()-a");
    }

    public static void main(float[] args) {
        System.out.println("float-main()-a");

    }
}
// jvm will search always for string args
//o/p:String-main()-a
