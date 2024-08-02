package session1;

import java.util.Scanner;

public class session1_Bai1 {
    public static void main(String[] args) {
        //Declare scanner instance
        Scanner sc = new Scanner(System.in);
        //User input name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name );
    }
}
