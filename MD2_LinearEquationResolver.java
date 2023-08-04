import java.util.Scanner;

public class MD2_LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất a*x + b = c");
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a = ");
        a = sc.nextDouble();
        System.out.println("b = ");
        b = sc.nextDouble();
        System.out.println("c = ");
        c = sc.nextDouble();

        if (a != 0) {
           double result = (c - b) / a;
            System.out.println("x = " + result);
        } else {
            if ( b == c){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
