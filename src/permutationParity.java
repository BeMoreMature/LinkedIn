import java.util.ArrayList;
import java.util.List;

public class permutationParity {
    public static void dfs(ArrayList<List<Integer>> res, ArrayList<Integer> substring, int n ){
        if(substring.size()==n){
            res.add(new ArrayList<>(substring));
            return;
        }
        for(int i  = 1; i <=n; i++){
            if(substring.contains(n)) continue;
                if(substring.size() > 0 && substring.get(substring.size()-1)%2 + i%2 !=1) continue;
                    substring.add(i);
                    dfs(res,substring,n);
                    substring.remove(substring.size()-1);
        }
    }
    public static void main (String args[]){
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = 3;
        dfs(res, new ArrayList<>(), n);
        res.forEach(System.out::print);
    }
}
