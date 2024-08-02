package session1;

import java.util.Scanner;
/*
* Xây dựng một ứng dụng tính toán chu vi và diện tích của hình vuông, hiển thị kết quả ra màn hình
* */
public class session1_Bai3 {
    public static void main(String[] args) {
        //Khai báo biến cạnh hình vuông
        float edge;
        System.out.print("Nhập chiều dài cạnh hình vuông:");
        //Khai báo biến scanner nhận input từ người dùng
        Scanner sc = new Scanner(System.in);
        //Nhận input từ người dùng vào biến edge
        edge = sc.nextFloat();
        //Tính chu vi
        float perimetter=edge*4;
        //Tính diện tích
        float area = edge*edge;
        //In ra kết quả
        System.out.printf("Chu vi là: %.2f", perimetter);
        System.out.println();
        System.out.printf("Diện tích là: %.2f",area);
    }
}
