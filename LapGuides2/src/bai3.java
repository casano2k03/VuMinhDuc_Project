import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int a = 2023;
        Scanner NT = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String hoVaTen = NT.nextLine();

        System.out.println("Nhập năm sinh của bạn: " );
        int namSinh = NT.nextInt();

        if ( a - namSinh < 16 ){
            System.out.println(" Bạn "+hoVaTen+" ở vị tuổi thành niên");
        } else if ( a - namSinh >= 16 && a - namSinh <18){
            System.out.println(" Bạn "+hoVaTen+" ở độ tuổi trường thành");
        } if (a - namSinh > 18){
            System.out.println(" Bạn "+hoVaTen+" đã già");
        }
    }
}
