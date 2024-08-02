package session1;

import java.util.Scanner;
//Xây dựng một ứng dụng tính toán chu vi và diện tích của hình vuông, hiển thị kết quả ra màn hình
public class session1_Bai4 {
    public static void main(String[] args) {
        //Khai báo biến scanner nhận input từ người dùng
        Scanner sc = new Scanner(System.in);
        //Nhập điểm Toán
        System.out.print("Nhập điểm Toán:");
        float mathScore = sc.nextFloat();
        //Nhập điểm Văn
        System.out.print("Nhập điểm Văn:");
        float literatureScore = sc.nextFloat();
        //Nhập điểm Anh
        System.out.print("Nhập điểm Anh:");
        float englishScore = sc.nextFloat();
        //Tính điểm trung bình
        float averageScore = (mathScore + literatureScore + englishScore)/3;
        //In ra kết quả
        System.out.printf("Điểm trung bình là: %.2f", averageScore);
    }
}
