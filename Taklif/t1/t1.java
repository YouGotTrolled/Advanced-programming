public class t1{
    public static void main(String[] args){
        System.out.println(fibunaji(49,0,1));
    }
    public static long fibunaji(int n,long f1,long f2){
        if(n==1)
            return(f1);
        else
            return(fibunaji(n-1,f2,f1+f2));
    }
}