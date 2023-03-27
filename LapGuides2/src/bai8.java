import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nguyên: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số nguyên #" + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        double trungBinh = (double) sum / n;
            System.out.println("Trung bình của" + n + " số nguyên: " + trungBinh);
        sc.close();
    }
}
