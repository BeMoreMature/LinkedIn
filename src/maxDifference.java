public class maxDifference {
    public static int helper(int a[]){
        int max_diff=0;
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(max_diff<a[i]-min){
                max_diff=a[i]-min;
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        return max_diff<0?-1:max_diff;
    }
    public static void main (String args[]){
        int arr[]={2,3,10,6,4,8,1};
        int b[]={7,9,5,6,3,2};
        System.out.print(helper(arr));
    }

}
