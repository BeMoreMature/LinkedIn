import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Comparator;

public class sortByBitCount {
    public static void main(String args[]){
        Integer a[]=new Integer[]{1,2,3,4,5,6,7};
        Arrays.sort(a,new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                int c1 = Integer.bitCount(i1);
                int c2= Integer.bitCount(i2);
                if(c1==c2){
                    return (int)i1-(int)i2;
                }else{
                    return c1-c2;
                }
            }
        });
        System.out.print(Arrays.toString(a));
    }
}
