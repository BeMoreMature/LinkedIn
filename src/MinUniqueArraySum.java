import java.util.Arrays;

public class MinUniqueArraySum {
    public static int helper(int a[]){
        Arrays.sort(a);
        int sum = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i]==a[i-1]){
                a[i]=a[i-1]+1;
            }
            sum +=a[i];
        }
        return sum;
    }
    public static void main (String args[]){
        int a[] = {1,2,2};
        System.out.print(helper(a));
    }
}
