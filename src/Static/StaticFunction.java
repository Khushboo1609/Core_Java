package Static;

class Doll{
    private String hairColor;

    static void updateHairColor(String s){
        System.out.println("My Hair Color is "+ s);
    }

    public void Hello(){
        this.updateHairColor("Yo");
    }
}



public class StaticFunction {
    public static void main(String[] args) {
        Doll.updateHairColor("Pink");
    }
}
