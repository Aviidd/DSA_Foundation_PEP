import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int qb[]=new int[n+1];
        int ans=climbStairsDpM(n, qb);
        int ans=climbStairsDpT(n, qb);
        System.out.println(ans);
    }
    
    public static int climbStairsR(int n){
        if(n==0) return 1;
        int total=1;
        if(n-1>=0){
            total +=climbStairsR(n-1);
        }
        if(n-2>=0){
            total +=climbStairsR(n-2);
        }
        if(n-3>=0){
            total +=climbStairsR(n-3);
            
        }
        
        
    }
    
    public static int climbStairDpM(int n, int qb[]){
        if(n==0){
            qb[n]=1;
            return 1;
        }
        if(qb[n] !=0){
            return qb[n];
        }
        int total=0;
        if(n-1>=0){
            total +=climbStairDpM(n-1, qb);
        }
        if(n-2>=0){
            total +=climbStairDpM(n-2, qb);
        }
        if(n-3>=0){
            total +=climbStairDpM(n-3, qb);
            
        }
    }
    
    public static int climbStairsDpT(int n, int qb[]){
        for(int i=0; i<n; i++){
            if(i==0){
                qb[i]=1;
                continue;
            }
            
            int total=0;
            if(i-1>=0){
                total +=qb[i-1];
            }
            if(i-2>=0){
                total +=qb[i-2];
            }
            if(i-3>=0){
                total +=qb[i-3];
            }
            qb[i]=total;
        }
        return qb[n];
    }

}