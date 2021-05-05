import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    int arr[]=new int[n];
    
    for(int i=0; i<n; i++){
        arr[i]=scn.nextInt();
    }
    for(int s=0; s<n; s++){
        for(int e=s; e<n; e++){
            for(int i=s; i<=e; i++){
                System.out.print(arr[i]+ "	");
            }
            System.out.println();
        }
    }
}

}