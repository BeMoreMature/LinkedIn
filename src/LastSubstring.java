import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LastSubstring {
    public static String helper(String s){
        char max_char = 'a';
        ArrayList<String> res= new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= max_char){
                max_char = s.charAt(i);
                res.add(s.substring(i,s.length()));
            }
        }
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index = 0, res = 0;
                while(index < o1.length() && index < o2.length()){
                    res = o1.charAt(index)-o2.charAt(index);
                    if(res == 0){
                        index++;
                        continue;
                    }
                    return res;
                }
                return -1;
            }
        });
        return res.get(res.size()-1);
    }
    public static void main(String args[]){
        System.out.print(helper("ggaggb"));
    }
}
