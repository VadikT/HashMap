import java.util.Map;

public class Entry {
     int key;
    long value;
    Entry next;

    public Entry(int K, long V) {
        this.key = K;
        this.value = V;
    }



    public long getValue() {
        return value;
    }


}
