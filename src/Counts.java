import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Counts {
        public static List<List<Integer>> helper(int counts[]){
            HashMap<Integer,Integer> map = new HashMap<>();	//store max_size and index of list in res
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            for(int i = 0 ; i<counts.length;i++){
                int max_size = counts[i];
                if(!map.containsKey(max_size)){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    res.add(temp);
                    map.put(max_size, res.size()-1);
                }else{
                    List<Integer> temp = res.get(map.get(max_size));
                    temp.add(i);
                    if(temp.size()==max_size){
                        map.remove(max_size);
                    }
                }
            }
            return res;
        }
        public static void main(String[] args) {
            int[] counts = new int[]{3,3,3,3,3,1,3};
            List<List<Integer>> res = helper(counts);
            for (List<Integer> list : res) {
                System.out.println(list);
            }
        }
    }
