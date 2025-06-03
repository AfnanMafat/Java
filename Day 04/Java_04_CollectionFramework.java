import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java_04_CollectionFramework {

    public static  void SetExample(){
        // Set (Unique)
        Set<Integer> set = new HashSet<>();

        int arr[] = {1,2,3,4,5,5,6,6,7};

        for(int i : arr){
            set.add(i);
        }

        System.out.println(set);
    }

    public static  void MapExample(){
        // Map (String,String)

        Map<String,String> map = new HashMap<>();
        map.put("name","Afnan");

        System.out.println(map);
    }

    public static void main(String[] args) {

        SetExample();
        MapExample();
    }
}
