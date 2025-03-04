import java.util.*;
public class newF{
    public static void main (String[] args){
        byte[] b1=new byte[6];
        byte[] b2=new byte[6];
        byte[] b3=new byte[6];
        for(int i =0;i<6;i++){
            b1[i]=(byte)(i+1);
        }
        while(true){
            System.out.print("__");
            for(int i =0;i<6;i++){
                System.out.print(b1[i]);
            }
            System.out.print("__");
            for(int i =0;i<6;i++){
                System.out.print(b2[i]);
            }
            System.out.print("__");
            for(int i =0;i<6;i++){
                System.out.print(b3[i]);
            }
            System.out.println("__");
            
        }
    }
}