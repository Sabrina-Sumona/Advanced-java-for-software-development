public class MyClass {
    static int number = 5;
//    final String fixed;
////  final var must need constructor
//    public MyClass(String fixed) {
//        this.fixed = fixed;
//    }
    int objMember;
    static int classMember = 33;
// non static member is obj member but static is class member
// static members are created when class is created but non-static are created when obj is created
    public void normalMethod() {
//        but we can call static & non-static from a normal method
        this.objMember = 505;
        classMember += 45;
    }
    public static void staticMethod() {
////        we can't access a non-static member from a static method
//        this.classMember = 50;
//        but we can access a static member from a static method
        classMember = 105;
        number += 20;
    }
}
