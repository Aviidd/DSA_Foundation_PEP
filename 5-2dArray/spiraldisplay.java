import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        
        int arr[][]=new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int rmin=0;
        int rmax=n-1;
        int cmin=0;
        int cmax=m-1;
        int done=0;
        int total=n*m;
        
        while(done<total){
            for(int r=rmin; r<=rmax; r++){
            System.out.println(arr[r][cmin]);
            done++;
            }
            
            for(int c=cmin+1; c<=cmax; c++){
            System.out.println(arr[rmax][c]);
            done++;
            }
            
            if(done==total){
                break;
            }
            
            for(int r=rmax-1; r>=rmin; r--){
            System.out.println(arr[r][cmax]);
            done++;
            }
            
            for(int c=cmax-1; c>=cmin+1; c--){
            System.out.println(arr[rmin][c]);
                done++;
            }
            
            rmin++; rmax--;
            cmin++; cmax--;
        }
    }

}