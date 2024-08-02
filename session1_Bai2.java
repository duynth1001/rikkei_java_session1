package session1;

import java.util.Scanner;
/*
 Xây dựng một ứng dụng chuyển đổi tiền tệ, cho phép tính giá trị tiền VNĐ dựa trên một tỉ giá cho trước và giá trị tiền USD được nhập vào.
 */

public class session1_Bai2 {
    public static void main(String[] args) {
        //Khai báo biến nhập liệu vào console
        Scanner input = new Scanner(System.in);
        //Khai báo biến tiền Việt Nam
        float tienVietNam;
        //Khai báo biến tỷ giá
        final float tyGia=25247.50f;
        //Khai báo biến USD
        float tienUSD;
        //Thông báo ra màn hình nhập số tiền USD
        System.out.print("Nhập vào tiền USD:");
        //Nhận input từ user
        tienUSD = input.nextFloat();
        //Tính toán kết quả
        tienVietNam = tienUSD * tyGia;
        //In kết quả ra màn hình
        System.out.printf("Tiền Việt Nam là: %.2f",tienVietNam );
        System.out.print(" vnd");
    }
}
