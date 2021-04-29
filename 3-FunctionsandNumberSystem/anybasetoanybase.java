import java.util.*;
  
  public class anybasetoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int destBase= scn.nextInt();
     
     int decimalValue = anybaseToDecimal(n, sourceBase);
     int destinationValue = decimaltoAnyBase( decimalValue , destBase);
     System.out.println(destinationValue);
   }   
   
   public static int anybaseToDecimal(int n, int sourcebase){
       int pow=1;
       int ans=0;
       
       while(n!=0){
           int rem=n%10;
           ans = ans + rem*pow;
           n=n/10;
           pow=pow*sourcebase;
       }
       return ans;
       
   }
   
   public static int decimaltoAnyBase(int n, int destbase){
    int ans=0;
    int pow=1;
    while(n!=0){
        int rem = n % destbase;
        ans = ans + rem*pow;
        pow = pow*10;
        n = n/destbase;
    }
    return ans;
   }
  }