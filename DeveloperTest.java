package OOP;

import java.util.Scanner;

public class DeveloperTest {
    public static void main(String[] args) {
        Developer arr[]=new Developer[5];
        FillArray(arr);
        PrintArray(arr);
    }
    public static void FillArray(Developer arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new Developer();
            System.out.print("Enter your name: ");
            arr[i].setName(s.next());
            System.out.print("Enter your degree(j=junior , s=senior):");
            arr[i].setDegree(s.next().charAt(0));
            System.out.print("Enter your Experience:");
            arr[i].seteYears(s.nextInt());
        }
    }
    public static void PrintArray(Developer arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i].getDegree()=='j' && arr[i].geteYears()>=10){
                System.out.println(arr[i]);
            }
        }
    }
}
