package session1;

import java.util.Scanner;
//Nhập vào bán kính đường tròn và thực hiện tính toán chu vi và diện tích của đường tròn
public class session1_Bai5 {
    public static void main(String[] args) {
        //Hằng số PI
        float PI = 3.14f;
        System.out.print("Nhập bán kính:");
        //Khai báo biến scanner nhận input từ người dùng
        Scanner sc = new Scanner(System.in);
        //Nhập bán kính
        float radius = sc.nextFloat();
        //Tính diện tích
        float area = PI * radius * radius;
        //Tính chu vi
        float perimeter = 2 * PI * radius;
        //In kết quả
        System.out.printf("Chu vi đường tròn là: %.2f",perimeter);
        System.out.println();
        System.out.printf("Diện tích đường tròn là: %.2f",area);
    }
}
