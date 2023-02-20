package Static;
class Outerstatic{
    int i=10;
    static int j=20;
    static class Innerstatic{
        void print(){
           // System.out.println(i); cannot access nonstatic variable inside static class
            System.out.println(j);
        }

    }
}

class Staticvariable {
    public static void main(String[] args) {
        Outerstatic.Innerstatic oi=new Outerstatic.Innerstatic();
        oi.print();


    }
}
