package OOP;

import java.util.Scanner;

public class ApartmentTest {
    public static void main(String[] args) {
      Apartment arr[]=new Apartment[3]; 
      FillArray(arr);
      PrintArray(arr);
    }
    public static void FillArray(Apartment arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new Apartment();
            System.out.println("Enter the Size of apartment you want (S or L): ");
            arr[i].setSize(s.next().charAt(0));
            System.out.println("Enter how many Rooms you want (1-8): ");
            arr[i].setRooms(s.nextInt());
        }
    }
    public static void PrintArray(Apartment arr[]){
        for (Apartment arr1 : arr) {
            if (arr1.getSize() == 'L') {
                System.out.println(arr1);
            }
        }
    }
}
