
package Bai3_Lab3;

import java.util.Scanner;
public class HangThucPham extends HangHoa {
    private static final String Null = null;
    private String ngaySanXuat;
    private String ngayHetHan;
    public HangThucPham(String maHang,String tenHang,String nhaSanXuat,int gia,String ngaySanXuat,String ngayHetHan,HangHoa hh){
        super(maHang,tenHang,nhaSanXuat,gia);
        this.ngayHetHan=ngayHetHan;
        this.ngaySanXuat=ngaySanXuat;
    }
    HangHoa hh=new HangHoa(Null,Null,Null,0);

    public void nhap(){
    hh.nhap();    
    Scanner nhap=new Scanner(System.in);
    System.out.println("nhap ngay san xuat:");
    ngaySanXuat=nhap.nextLine();
    System.out.println("nhap ngay het han:");
    ngayHetHan=nhap.nextLine();
    
            }
    @Override
    public String toString(){
        hh.toString();
return "HangThucPham [ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + ", hh=" + hh + "]";    }
    
}
