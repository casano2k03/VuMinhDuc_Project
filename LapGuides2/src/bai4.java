import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1 đến 12: ");
        int thang = scanner.nextInt();

        // cấu trúc switch (expression) {
        switch (thang) {
            //case value1:
            case 1:
                System.out.println("Tháng 1");
                break;
            // default:                                     //Switch-case là một cấu trúc điều khiển dùng để kiểm
                                                            // soát luồng chương trình, nó cho phép chúng ta xử lý nhiều
                                                            // tình huống khác nhau dựa trên giá trị của biểu thức hoặc biến.

            //expression là một biểu thức hoặc biến được sử dụng để kiểm tra các giá trị.
            //case là một nhãn được sử dụng để kiểm tra giá trị của expression.
            //value1, value2 là các giá trị mà expression có thể nhận được, chúng được so sánh với giá trị của expression.
            //default là một nhãn tùy chọn, được sử dụng khi không có một case nào khớp với giá trị của expression.
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println("Tháng 6");
                break;
            case 7:
                System.out.println("Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;
            default:
                System.out.println("Năm 2 đại học rồi còn cố chấp bấm "+thang );
                break;
        }
    }
}
