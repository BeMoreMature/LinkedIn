import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class usernameSystem {
    public static List<String> helper(List<String> list){
        ArrayList<String> res = new ArrayList<>();
        if(list.size() == 0) return res;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : list){
            if(!map.containsKey(str)){
                map.put(str,0);
                res.add(str);
            }else{
                int temp = map.get(str);
                map.put(str, temp+1);
                res.add(str+(temp+1));
            }
        }
        return res;
    }
    public static void main (String args[]){
        List<String> s = new ArrayList<>();
        s.add("bob");
        s.add("alice");
        s.add("bob");
        s.add("alice");
        s.add("bob");
        s.add("alice");
        System.out.print(helper(s));
    }
}
