public class subarraySum {
        public static long sub(int a[]){
            long g=0,res=0;
            for(int i=0;i<a.length;i++){
                g+=(i+1)*a[i];
                res+=g;
            }
            return res;
        }
    public static void main (String args[]){
        int nums[]={1,2,3,4};
        System.out.print(sub(nums));
    }
}
