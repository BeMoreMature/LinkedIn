import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinctPair2Sum {
    public static ArrayList<List<Integer>> helper(int []a, int target){
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j] == target){
                res.add(Arrays.asList(a[i],a[j]));

                while(i<j && a[i]==a[i+1]) i++;
                while(i<j && a[j]==a[j-1]) j--;
                i++;
                j--;
            }else{
                if(a[i]+a[j] < target){
                    i++;
                }else {
                    j--;
                }
            }
        }
        return res;
    }
    public static void main (String args[]){
        int a[]={6,6,3,9,3,5,1};
        ArrayList<List<Integer>> res = helper(a,12);
        for(List<Integer> list : res){
            list.forEach(System.out::println);
        }
    }
}
