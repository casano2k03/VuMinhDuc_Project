
package Bai4_Lab4;
import java.util.Scanner;
public abstract class Hocvien {
    private String hoten;
    private String diachi;
    private int loaiUuTien;
    private String chuongTrinhDangKi;
    private double Hocphi;
    public Hocvien(String hoten,String diachi,int loaiUuTien,String chuongTrinhDangKi,double Hocphi){
        this.hoten =hoten;
        this.diachi=diachi;
        this.loaiUuTien=loaiUuTien;
        this.chuongTrinhDangKi=chuongTrinhDangKi;
        this.Hocphi=Hocphi;
    }

    public void setHocphi(double Hocphi) {
        this.Hocphi = Hocphi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public void setChuongTrinhDangKi(String chuongTrinhDangKi) {
        this.chuongTrinhDangKi = chuongTrinhDangKi;
    }

    public double getHocphi() {
        return Hocphi;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public String getChuongTrinhDangKi() {
        return chuongTrinhDangKi;
    }
    public void nhapThongTin(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        setHoten(nhap.nextLine());
        System.out.print("nhap dia chi: ");
        setDiachi(nhap.nextLine());
        String b;        
        do{
        System.out.print("Nhap chuong trinh dang ki(nhap ro chu) \n1:Do hoa \n2:Lap trinh \n nhap:");
        setChuongTrinhDangKi(nhap.nextLine());
        b=getChuongTrinhDangKi();
        }while(!"Do hoa".equals(b)&&!"Lap trinh".equals(b));
        System.out.println("da nhap xong");

    }
    public abstract void nhaphp();
    public abstract void hocPhi();
    public void inThongTin(){
        System.out.println("*Ho ten: "+getHoten());
        System.out.println("*Dia chi: "+getDiachi());
        System.out.println("*Loai uu tien: "+getLoaiUuTien());
        System.out.println("*Loai chuong trinh dang ki hoc: "+getChuongTrinhDangKi());
    }  
}
