package stars;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers of line you want: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("***********");
        }
    }
}
