import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class simpleQuery {
    public static ArrayList<Integer> helper(int a[], int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                i++;
            }else{
                res.add(i);
                j++;
            }
        }
        return res;

    }
    public static void main (String args[]){
        int a[]={1,4,2,2,6};
        int b[]={4,5};
        System.out.print(helper(a,b));
    }
}
