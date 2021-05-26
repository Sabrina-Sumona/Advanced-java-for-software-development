import java.util.ArrayList;

public class GarbageCollection {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        while(true) {
            for (int i = 0; i<100; i++)
            {
                String token = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
                list.add(token + token + token + token + token + token + token + token + token);
            }

//            some operations here.......

//            if we forget to clear list, it becomes infinite
            list.clear();
        }
    }
}
