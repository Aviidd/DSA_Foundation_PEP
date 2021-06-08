import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int coins[]=new int[n];
        for(int i=0; i<n; i++){
            coins[i]=scn.nextInt();
        }
        
        int tar=scn.nextInt();
        int qb[]=new int[tar+1];
        qb[0]=1;
        
        for(int t=0; t<=tar; t++){
            for(int i=0; i<n; i++){
                int coin=coins[i];
                if(coin > t) continue;
                int req=t-coin;
                qb[t] +=qb[req];
            }
        }
        System.out.println(qb[tar]);
    }
}