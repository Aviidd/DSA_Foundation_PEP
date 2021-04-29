import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     
     int finalvalue=0;
     int pow=1;
     
     while(n2!=0){
         int d2=n2%10;
         n2=n2/10;
         int singleDigitProduct = getproductwithsingledigit(b,n1,d2);
         singleDigitProduct = singleDigitProduct*pow;
         finalvalue=anybaseaddition(b,finalvalue,singleDigitProduct);
         pow=pow*10;
     }
     return finalvalue;
 }
 
 public static int anybaseaddition(int b, int n1, int n2){
       int ans=0;
       int pow=1;
       int carry=0;
       while(n1!=0 || n2!=0 || carry!=0){
           int dig1=n1%10;
           int dig2=n2%10;
           n1=n1/10;
           n2=n2/10;
           int digit=dig1+ dig2+ carry;
           carry=digit/b;
           digit=digit%b;
           ans=ans+digit*pow;
           pow=pow*10; 
       }
       return ans;
 }
 
 public static int getproductwithsingledigit(int b, int n1, int d2){
     int ans=0;
     int pow=1;
     int carry=0;
     while(n1!=0 || carry!=0){
         int dig1=n1%10;
         n1=n1/10;
         int digit = dig1*d2+carry;
         carry=digit/b;
         digit=digit%b;
         ans=ans+digit*pow;
         pow=pow*10;
     }
     return ans;
 }

}