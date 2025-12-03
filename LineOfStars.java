package stars;

import java.util.Scanner;

 
public class LineOfStars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of stars you wante: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("*");
        }        
    }
   
}
