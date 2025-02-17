
public class t2{
    static int t=1;
    public static void main(String[] args){
        BInteger f1=new BInteger();
        BInteger f2=new BInteger();
        f1.add(1);
        f2.add(1);
        System.out.println(fibunajiBig(100,f1,f2).toString());
    }
    public static long fibunaji(int n,long f1,long f2){
        if(n==1)
            return(f1);
        else
            return(fibunaji(n-1,f2,f1+f2));
    }
    public static BInteger fibunajiBig(int n,BInteger f1,BInteger f2){
        if(n==1){
            return(f1);
        }
        else{
            f1.add(f2);
            return(fibunajiBig(n-1,f2,f1));
        }
    }
}
public class BInteger{
    int[] bint=new int[1];
    public String toString(){
        String result="";
        int i=0;
        for(;i<bint.length-1;i++){
            String temp=String.valueOf(bint[i]);
            while(temp.length()<9){
                temp="0"+temp;
            }
            result=temp+result;
        }
        return(bint[i]+result);
    }
    public void add(int x){
        int i=0;
        long sum=x;
        do{
            sum+=bint[i];
            if (sum>999999999){
                bint[i++]=(int)sum%1000000000;
                if(i==bint.length)
                    extend();
                sum/=1000000000;
            }else{
                bint[i]=(int)sum;
                sum=-1;
            }
        }while(sum>0);
    }
    public void add(BInteger x){
        int sum=0;
        int i=0;
        while(x.bint.length>bint.length){
            extend();
        }
        for(;i<x.bint.length;i++){
            sum+=x.bint[i]+bint[i];
            bint[i]=sum%1000000000;
            sum/=1000000000;
        }
        if(sum>0){
            if(i==bint.length)
                extend();
            bint[i]=sum;
        }
    }
    private void extend(){
        int[] temp=new int[bint.length+1];
        for(int i=0;i<bint.length;i++){
            temp[i]=bint[i];
        }
        bint=temp;
    }
}