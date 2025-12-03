package stars;

import java.util.Scanner;

public class DesignatedOfStars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of line you want:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int x=i;x<n;x++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int x=n;x>i;x--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
