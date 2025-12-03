package stars;

import java.util.Scanner;

public class ItalicsOfStars {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of line you want: ");
      int n=s.nextInt();
      for(int i=0;i<n;i++){
          for(int x=0;x<i;x++){
              System.out.print(" ");
          }
          System.out.println("*");
      }
    }
    
}
