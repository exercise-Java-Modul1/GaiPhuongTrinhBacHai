import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn giải phương trình bậc hai có dạng: a*x*x + b*x + c = 0");
            System.out.print("Với a = ");
            double a = sc.nextDouble();
            System.out.print("Với b = ");
            double b = sc.nextDouble();
            System.out.print("Với c = ");
            double c = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phương trình có vô số nghiệm.");
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("Phương trình có nghiệm duy nhất là : " + x);
                }
            } else {
                double den_ta = b * b - 4 * a * c;
                if (den_ta > 0) {
                    double x1 = (-b + Math.sqrt(den_ta)) / 2 * a;
                    double x2 = (-b - Math.sqrt(den_ta)) / 2 * a;
                    System.out.println("Phương trình có hai nghiệm phân biệt là : " + x1 + " và " + x2);
                } else if (den_ta == 0) {
                    double x = -b / 2 * a;
                    System.out.println("Phương trình có nghiệm duy nhất là : " + x);
                } else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            }
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println();
        }
    }
}
