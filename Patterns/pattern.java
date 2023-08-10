package Patterns;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printTriangle(n);
    }

    static void printTriangle(int n) {
        // code here
        int col;
        int stars;
        for(int row=1; row < n*2 ; row++){
            stars = row > n ? n*2 - row: row  ;
            for(col =1; col <= stars; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
