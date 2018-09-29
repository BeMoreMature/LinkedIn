import javax.swing.text.html.parser.Entity;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortByFrequency {
    public void helper(int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        PriorityQueue<Map.Entry> pq = new PriorityQueue<>(new Comparator<Map.Entry>(){
            public int compare(Map.Entry e1, Map.Entry e2){
                if((int)e1.getValue()==(int)e2.getValue()){
                    return (int)e1.getKey()-(int)e2.getKey();
                }else{
                    return (int)e1.getValue()-(int)e2.getValue();
                }
            }
        });
        for(Map.Entry entry:map.entrySet()){
            pq.offer(entry);
        }
        while(!pq.isEmpty()){
            Map.Entry entry = pq.poll();
            System.out.print(entry.getKey());
        }
    }
    public static void main (String args[]){
        int nums[]={1,2,3,4,1,3,6};
        sortByFrequency s = new sortByFrequency();
        s.helper(nums);
    }
}
