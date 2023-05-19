
package Bai1_Lab4;

public class Main {
    public static void main(String[] args) {
        BenhVien bv=new BenhVien("Phuong Dong","Ha Noi","Nguyen Van ABC");
        BenhNhan bn=new BenhNhan("dong kinh","sap-chet",bv,"Dao",18,'N');
        System.out.println(bn.toString());
    }
}
