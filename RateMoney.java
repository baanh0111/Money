import java.util.Scanner;

public class RateMoney {
    public static void main(String[] args) {
        System.out.println("Nhap so tien: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        System.out.println("Nhap ty gia (USD/VND): ");
        double exchangeRate = scanner.nextDouble();

        double vndMoney = money * exchangeRate;

        System.out.println("So tien tren VND: " + vndMoney + " VND: ");
    }

}

