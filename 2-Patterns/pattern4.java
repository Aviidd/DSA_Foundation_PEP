import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int spaces=0;
        int stars=n;
        
        for(int i=1; i<=n; i++){
            //spaces loop
            for(int j=1; j<=spaces; j++){
                System.out.print("	");
            }
            
            //starloop
            for(int k=1; k<=stars; k++){
                System.out.print("*	");
            }
        spaces++;
        stars--;
        System.out.println();
        }

    }
}