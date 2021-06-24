import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public void genericSubtypes() {
        // String is a subtype of Object, or String extends Object
        Object obj = "hello"; // a supertype reference holding a subtype instance
        System.out.println(obj); //hello

        // But ArrayList<String> is not a subtype of ArrayList<Object>
        List<String> stringList = new ArrayList<>();
//        List<Object> objectList = stringList; // Error, not correct
//         ArrayList<Object> lst = new ArrayList<String>(); // Error, not correct

    }

    public void useWildCard() {
//        List<Object> objectList = new ArrayList<>();
//        objectList.add("One");
//        objectList.add("Two");
//        this.printList(objectList);
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Three");
//        stringList.add("Four");
//        this.printList(stringList);

        List<Integer> integerList = Arrays.asList(5, 10, 15);
//        System.out.println(this.sum(integerList));
        System.out.println(this.sumUsingUpperBound(integerList));
        this.printUsingLowerBound(integerList);

        
        List<Double> doubleList = Arrays.asList(20.2, 25.3, 30.5);
//        System.out.println(this.sum(doubleList));
        System.out.println(this.sumUsingUpperBound(doubleList));
//        this.printUsingLowerBound(doubleList); // here double is not super class of int

        List<Number> numberList = Arrays.asList(35, 40.4, 45.6);
//        System.out.println(this.sum(numberList));
        System.out.println(this.sumUsingUpperBound(numberList));
        this.printUsingLowerBound(numberList);
    }
//    public void printList(List<Object> list) {
//        for(Object o: list)
//            System.out.println(o);
//    }

//    '?' means the type can be any
    public void printList(List<? extends Object> list) {
        for(Object o: list) {
            System.out.println(o);
        }
    }
//    public void printList(List<?> list) {
//    for(Object o: list)
//        System.out.println(o);
//    }

//    public double sum (List<Number> numberList) {
//        double sum = 0.0;
//        for(Number num: numberList) {
//            sum += num.doubleValue();
//        }
//        return sum;
//    }

//    public double sum (List<? extends Number> numberList) {
//        double sum = 0.0;
//        for(Number num: numberList) {
//            sum += num.doubleValue();
//        }
//        return sum;
//    }

    public double sumUsingUpperBound(List<? extends Number> numberList) {
        double sum = 0.0;
        for(Number num: numberList) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public void printUsingLowerBound(List<? super Integer> list) {
        System.out.println(list);
    }

}
