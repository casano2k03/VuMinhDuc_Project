
package Bai7_lab5;
import java.util.ArrayList;
import java.util.Scanner;
public class MyArrayList {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        ArrayList<Object> A=new ArrayList();
        System.out.print("Nhap 1 so nguyen: ");
        A.add(nhap.nextInt());
        System.out.print("Nhap 1 so thuc: ");
        A.add(nhap.nextFloat());
        System.out.print("Nhap 1 chuoi: "); 
        nhap.nextLine();
        A.add(nhap.nextLine());
        System.out.println("Nhap 1 gia tri boolean(true or false): ");
        A.add(nhap.nextBoolean());
        System.out.println("In ra ArrayList:"+A);
    }
}
