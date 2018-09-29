public class shiftString {
    public static String shift(String str, int l, int r){
        if(l==r) return str;
        if(l > r){
            l=l-r;
            l= l % str.length();
            return str.substring(l,str.length())+str.substring(0,l);
        }else{
            r= r-l;
            r = r % str.length();
            return str.substring(str.length()-r,str.length())+str.substring(0,str.length()-r);
        }
    }
    public static void main (String args[]){
        System.out.print(shift("abcde",3,2));
    }
}
