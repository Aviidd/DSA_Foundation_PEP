import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
       
       Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int k=scn.nextInt();
       
       int temp=n;
       int length=0;
       while(temp!=0){
           temp=temp/10;
           length++;
       }
       k=k % length;
       if(k<0){
           k = k + length;
       }
       
       int d1 = n % (int)Math.pow(10,k);
       int d2 = n / (int)Math.pow(10,k);
       
       int value = (d1 * (int)Math.pow(10,length-k)) + d2;
       
       System.out.println(value);
    }
   }