import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space = n-1;
        int star = 1;
        
        for(int i=1; i<=n; i++){
            
            //space loop
            for(int j=1; j<=space; j++){
                System.out.print("	");
            }
            
            //star loop
            for(int k=1; k<=star; k++){
                System.out.print("*	");
            }
            space--;
            star++;
            System.out.println();
        }

    }
}