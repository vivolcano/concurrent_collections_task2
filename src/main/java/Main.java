import java.util.Random;

public class Main {
    public static void main(String[] args) {


        CollectionMap collectionMap = new CollectionMap();

        new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "1").start();
        new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "2").start();
        new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "3").start();
        new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "4").start();
        new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "5").start();


        new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "1").start();
        new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "2").start();
        new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "3").start();
        new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "4").start();
        new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "5").start();

    }

    private static int[] makeRandArray() {
        Random random = new Random();
        int[] array = new int[1_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
