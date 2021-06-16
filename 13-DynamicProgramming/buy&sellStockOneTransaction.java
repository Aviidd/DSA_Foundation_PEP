import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int cost[]=new int[n];
        
        for(int i=0; i<n; i++){
            cost[i]=scn.nextInt();
        }
        
        int buy=cost[0];
        int max=0;
        
        for(int val : cost){
            buy=Math.min(buy,val);
            max=Math.max(max, val-buy);
        }
        
        System.out.println(max);
    }

}