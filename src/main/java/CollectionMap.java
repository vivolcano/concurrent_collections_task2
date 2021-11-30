import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMap {

    private final Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

    private final ConcurrentHashMap<Integer, Integer> concurrentHMap = new ConcurrentHashMap<>();

    public void putColMap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            map.put(i,array[i]);
        }
    }

    public void putConcurrentMap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            concurrentHMap.put(i,array[i]);
        }

    }

}
