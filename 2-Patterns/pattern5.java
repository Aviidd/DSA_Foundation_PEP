import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int space = n/2;
        int stars = 1;
        
        for(int i=1; i<=n; i++){
            
            //spaceloop
            for(int j=1; j<=space; j++){
                System.out.print("	");
            }
            
            //starsloop
            for(int j=1; j<=stars; j++){
                System.out.print("*	");
            }
            
            //condition
            if(i<=n/2){
                space--;
                stars +=2;
            }
            else{
                space++;
                stars -=2;
            }
            System.out.println();
        }

    }
}