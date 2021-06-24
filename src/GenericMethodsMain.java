import java.util.ArrayList;
import java.util.List;

public class GenericMethodsMain {
    public static void main(String[] args) {
        // working with generic methods
//        GenericMethodsMain app = new GenericMethodsMain();
//
//        String stringElement = "String element";
//        List<String> stringList = new ArrayList<>();
////        app.<String>addStringToList(stringElement, stringList);
////        app.<String>addElementToList(stringElement, stringList);
//        app.addElementToList(stringElement, stringList);
////        app.addElementToList("String element2", stringList);
////        app.addElementToList("String element3", stringList);
//        System.out.println(stringList);
//
//////        here str class extends obj class that's why we can use obj in str list but not vise versa
////        String stringElement = "String element";
////        List<Object> objectList = new ArrayList<>();
////        app.<Object>addElementToList(stringElement, objectList);
////        System.out.println(objectList);
////
////        Object objectElement = new Object();
////        List<String> stringList = new ArrayList<>();
////        app.<Object>addElementToList(objectElement, stringList);
////        System.out.println(objectList);
//
//        Integer integerElement = 55;
//        List<Integer> integerList = new ArrayList<>();
////        app.addIntToList(integerElement, integerList);
//        app.addElementToList(integerElement, integerList);
//        app.addElementToList(123, integerList);
//        app.addElementToList(9631, integerList);
//        System.out.println(integerList);
//
//        My_Class myClass = new My_Class();
//        List<My_Class> myClassList = new ArrayList<>();
////        app.addMyClassToList(myClass, myClassList);
//        app.addElementToList(myClass, myClassList);
//        System.out.println(myClassList);

        // working with wild card
        WildCards wildcard = new WildCards();
//        wildcard.genericSubtypes();
        wildcard.useWildCard();
    }

//    public void addIntToList(int element, List<Integer> list){
//        list.add(element);
//    }
//
//    public void addStringToList(String element, List<String> list){
//        list.add(element);
//    }
//
//    public void addMyClassToList(My_Class element, List<My_Class> list){
//        list.add(element);
//    }

////    generic method
//    public <T> void addElementToList(T element, List<T> list){
//
//        list.add(element);
//    }
}
