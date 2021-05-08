import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      
      int n=scn.nextInt();
      
      int arr[][]=new int[n][n];
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[0].length; j++){
              arr[i][j]=scn.nextInt();
          }
      }
      
      int k=0;
      while(k<arr[0].length){
          
          int i=0;
          int j=k;
          
          while(i<arr.length && j<arr[0].length){
              System.out.println(arr[i][j]);
              i++;
              j++;
          }
          k++;
      }
      
    }

}