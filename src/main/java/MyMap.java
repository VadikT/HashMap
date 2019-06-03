import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MyMap {

    private static final int SIZE = 16;

    private Entry table[] = new Entry[SIZE];


    public Entry get(Integer k) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];


        while(e != null) {
            if(e.key == k) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    public void put(Integer k, Long v){
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];

        if (e != null){

            if (e.key == k){
                e.value = v;
            }else{
                while (e.next != null){
                    e = e.next;
                }

                Entry entryOld = new Entry(k, v);
                e.next = entryOld;
            }

        }else {
            Entry entryNew = new Entry(k,v);
            table[hash] = entryNew;
        }
    }

    public static void main(String[] args) {
        MyMap myMap = new MyMap();

        myMap.put(13, 2147483648L);
        myMap.put(14, 32424324523L);



        Entry e = myMap.get(13);
        System.out.println(""+ e.getValue());
    }
}

