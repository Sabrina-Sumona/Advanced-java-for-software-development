//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {

//        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add(0, "New String");
        System.out.println(strList.get(0).startsWith("New"));
//        strList.add(1, new Cars());

        // Generics
        ArrayList<Cars> carsList = new ArrayList<>();
        carsList.add(0, new Cars());
//        carsList.add(1, "New String");
        System.out.println(carsList.get(0).getColor());

        // raw collections (does not have type arg), not generics
        ArrayList rawlist = new ArrayList();
        rawlist.add(0, "New String" );
        rawlist.add(1, new Cars());

        // here raw list can't resolve the type
//        System.out.println(rawList.get(0).startsWith("New"));
//        System.out.println(rawList.get(1).getColor());

        System.out.println();

        // to resolve we need type casting
        String str1 = (String) rawlist.get(0);
        System.out.println(str1.startsWith("Old"));
        // but it is hassling & can be wronged easily
        // and it holds diff types of data which can be lead to error when it is dynamic
//        Cars car = (Cars) rawlist.get(1);
//        car.setColor("Red");
//        System.out.println(car.getColor());
        // so we should maintain the type consistently
        // if not it can be crashed
//        String str2 = (String) rawlist.get(1);
//        System.out.println(str1.startsWith(str2));
        // for solving this problems generics is used

        HashMap<String, Integer> map = new HashMap<>();

        HashMap<String, ArrayList<Integer>> maplist = new HashMap<>();
    }
}
