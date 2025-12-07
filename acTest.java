package OOP;

import java.util.Scanner;

public class acTest {
    public static void main(String[] args) {
        AC arr[]=new AC[5];
        fillArray(arr);
        printAll(arr);
    }
    public static void fillArray(AC arr[]){
        Scanner s=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=new AC();
            System.out.print("Enter the brand you want: ");
            arr[i].setBrand(s.next());
            System.out.print("Enter the type you want (i=inverter , r=regular): ");
            arr[i].setType(s.next().charAt(0));
            System.out.print("Enetr the size you want: ");
            arr[i].setSize(s.nextDouble());            
        }
    }
    public static void printAll(AC arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
