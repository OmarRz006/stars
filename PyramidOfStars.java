package stars;

import java.util.Scanner;

public class PyramidOfStars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of line you want: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int x=i;x<n;x++){
                System.out.print(" ");
            }
            for(int y=1;y<=(2*i-1);y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
