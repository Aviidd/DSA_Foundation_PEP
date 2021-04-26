import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    
    int stars=1;
    int spaces = 2*n-3;
    
    for(int i=1; i<=n; i++){
        //star loop
        int count=1;
        for(int j=1; j<=stars; j++){
            System.out.print(count +"	");
            count++;
        }
        
        //spaces loop
        for(int j=1; j<=spaces; j++){
            System.out.print("	");
        }
        
        //star loop
        if(i==n){
            stars--;
            count--;
        }
        for(int j=1; j<=stars; j++){
            count--;
            System.out.print(count +"	");
        }
        stars++;
        spaces -=2;
        System.out.println();
    }
 }
}