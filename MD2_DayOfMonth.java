import java.util.Scanner;

public class MD2_DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng muốn kiểm tra: ");
        int month = sc.nextInt();

        switch (month) {
            case 2:
                System.out.println("Tháng 2 có 28 ngày hoặc 29 vào năm nhuận");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + "có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + "có 30 ngày");
            default:
                System.out.println("Nhập lại");
                break;
        }
    }
}
