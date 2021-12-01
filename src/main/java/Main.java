import java.util.Random;

public class Main {
    public static void main(String[] args) {


        CollectionMap collectionMap = new CollectionMap();

        for (int i = 0; i < 10; i++) {
            new Thread(null, () -> collectionMap.putColMap(makeRandArray()), "" + i).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(null, () -> collectionMap.putConcurrentMap(makeRandArray()), "" + i).start();
        }
        
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
