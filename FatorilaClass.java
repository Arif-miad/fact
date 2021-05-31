

package javaapplication;

import java.util.Scanner;


public class FatorilaClass {
    public static void main(String[] args) {
        int x,sum=1;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.print("Enter the value of x:");
        for (int i =10-x; i>=1; i--) {
            System.out.println(i);
            sum = sum*i;
        }
        System.out.println(sum);
        
    }
          
}
