import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        
        int x=scn.nextInt();
        int last=lastIndex(arr, 0, x);
        System.out.println(last);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(arr.length==idx){
            return -1;
        }
        
        int FaithIndex=lastIndex(arr, idx+1, x);
        if(FaithIndex != -1){
            return FaithIndex;
        }
        
        if(arr[idx]==x){
            return idx;
        }
        
        return -1;
        
    }

}