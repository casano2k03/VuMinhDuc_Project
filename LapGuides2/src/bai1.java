import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a, b;
        Scanner nhapkituso = new Scanner(System.in);
        System.out.println("Nhap số A");
        a = nhapkituso.nextInt();

        System.out.println("Nhập số B");
        b = nhapkituso.nextInt();

        int tổng = a + b;
        System.out.println(a+"+"+b+"="+tổng);

        int hiệu = a - b;
        System.out.println(a+"-"+b+"="+hiệu);

        float thương = (float) a / b;
        System.out.println(a+"/"+b+"="+thương);

        int tích  = a * b;
        System.out.println(a+"*"+b+"="+tích);

        if ( a > b ){
            System.out.println( a+" > "+b);
        } else if ( a < b ){
            System.out.println(a+ "<"+b);
        }if ( a == b ){
            System.out.println(a+"="+b);
        }
    }

}
