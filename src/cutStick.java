import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cutStick {
    public static List<Integer> helper(int a[]){
        Arrays.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        while(totalSum(a)>0){
            res.add(totalSum(a));
            int index=0;
            while(a[index]<=0) index++;
            int min=a[index];
            for(;index<a.length;index++){
                a[index]=a[index]-min;
            }
        }
        return res;
    }
    public static int totalSum(int a[]){
        int count = 0;
        for(int i:a){
            if(i!=0){
                count++;
            }
        }
        return count;
    }
    public static void main (String args[]){
        int a[]={1,1,2,3};
        int b[]={5,4,4,2,2,8};
        int c[]={1,2,3,4,3,3,2,1};
        helper(a).forEach(System.out::print);
    }
}
