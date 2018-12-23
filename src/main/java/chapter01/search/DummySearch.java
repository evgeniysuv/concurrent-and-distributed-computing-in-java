package chapter01.search;

/**
 * Created by esuv on 12/23/18
 */
public class DummySearch implements Searcher {

    @Override
    public int search(int x, int[] sortedData, int ignored) {
        for (int element : sortedData) {
            if (element == x) return element;
        }
        return -1;
    }
}
