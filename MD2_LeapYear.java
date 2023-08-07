import java.util.Scanner;

public class MD2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm kiểm tra: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " là năm không nhuận");
        }
    }
}
