import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] arr=new int[n];
    
    for(int x=0; x<n; x++){
        arr[x]=scn.nextInt();
    }
    int d=scn.nextInt();
    int ceil=0;
    int floor=0;
    int i=0;
    int j=n-1;
    
    while(i<=j){
        int mid=(i+j)/2;
        if(d<arr[mid]){
         ceil=arr[mid];
         j=mid-1;
        }else if(arr[mid]<d){
            floor=arr[mid];
            i=mid+1;
        }else{
            ceil=floor=arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
    
}

}