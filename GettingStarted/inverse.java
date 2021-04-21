import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn=new Scanner(System.in);
  int originalvalue=scn.nextInt();
  int inversevalue=0;
  int inversevaluedigit=1;
  
  while(originalvalue!=0){
      int positionofinversedigit=originalvalue%10;
      inversevalue=inversevalue+inversevaluedigit*(int)Math.pow(10,positionofinversedigit-1);
      inversevaluedigit++;
      originalvalue=originalvalue/10;
  }
  System.out.println(inversevalue);
 }
}