import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] a = new int[n];
    
    for(int i=0; i<n; i++){
        a[i]=scn.nextInt();
    }
    int span=getspan(a);
    System.out.println(span);
 }
 
 public static int getspan(int[] a){
     int max = getmax(a);
     int min = getmin(a);
     int span=max-min;
     return span;
 }
 
 public static int getmax (int [] a){
     int max=a[0];
     for(int i=1; i<a.length; i++){
         if(max<a[i]){
             max=a[i];
         }
     }
     return max;
 }
 
 public static int getmin(int[] a){
     int min=a[0];
     for(int i=1; i<a.length; i++){
         if(min>a[i]){
             min=a[i];
         }
     }
     return min;
 }

}