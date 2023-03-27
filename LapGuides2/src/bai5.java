import java.util.Scanner;

public class bai5 {
        public static void main(String[] args){
            Scanner nhapSo = new Scanner(System.in);
            System.out.println("Nhập số lượngw: ");
            int n = nhapSo.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++){
                System.out.printf("Nhập số nguyên thứ" + i + ":");
                int number = nhapSo.nextInt();
                sum += number;
            }
            if (sum > 100){
                System.out.println("Tổng các số nguyên vừa nhập là" + sum);
            }
        }
}
