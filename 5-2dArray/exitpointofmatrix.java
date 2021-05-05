import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        for(int i=1; i<n; i++){
            int j=0;
            while(i!=j){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
                j++;
            }
        }
        
        for(int r=0; r<n; r++){
            int i=0; 
            int j=n-1;
            while(i<j){
                int t=arr[r][i];
                arr[r][i]=arr[r][j];
                arr[r][j]=t;
                i++;
                j--;
            }
        }
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}