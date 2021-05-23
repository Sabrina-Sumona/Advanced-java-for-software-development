public class MyMain {
    public static void main(String[] args) {

 ////       here we can call the class without creating obj because the number is declared as static
//        System.out.println(MyClass.number);

//        MyClass myClass = new MyClass("Final keyword example");
//        we can't reassign a final var
//        myClass.fixed = "Final variable reassigned";
//        System.out.println(myClass.fixed);

        MyClass myClass1 = new MyClass();
////         static member can't accessed via obj
//        myClass1.number+=10;

        MyClass.number+=10;

        MyClass myClass2 = new MyClass();

        MyClass.number+=10;

//        here myClass1 & myClass2 get the same value as the var is static & it reassigned by using the class
        System.out.println(myClass1.number);
        System.out.println(myClass2.number);

        System.out.println();

        myClass1.normalMethod();
////       we can't call static method using obj
//        myClass1.staticMethod();
        MyClass.staticMethod();
        System.out.println(myClass1.number);
        System.out.println(myClass2.number);

    }
}