package mutable;


class ConstantPoolArea {
    public static void main(String[] args) {
        String str1=new String("Education");
        String str2=new String("Education");
        String str3="abc";
        String str4="abc";
        System.out.println(str1==str2);//every time new object is created in heap memory(so references differ)
                                        // false
        System.out.println(str3==str4);//object is crating in constent pool area(same references)//true

    }
}
