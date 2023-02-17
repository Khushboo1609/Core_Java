package mutable;
class Equal {

    public static void main(String[] args){
        int i=10;
        int j=10;
        String s1=new String("Coding");
        String s2=new String("Coding");
        System.out.println(i==j);  //true(primitive data type)
        System.out.println(s1==s2);//false(comparing the references,even if values are same result is false becoz
                                   // references are different)
        System.out.println(s1.equals(s2));//true( comparing the data  at respective reference)


    }

}
