
package Bai5_Lab4;
import java.util.Scanner;
public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGiangVien;
    private double luongThang;
    public GiangVien(String hoTen,String diaChi,String loaiGiangVien,double luongThang){
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.loaiGiangVien=loaiGiangVien;
        this.luongThang=luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiGiangVien(String loaiGiangVien) {
        this.loaiGiangVien = loaiGiangVien;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiGiangVien() {
        return loaiGiangVien;
    }
    public void nhapThongTin(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        setHoTen(nhap.nextLine());
        System.out.print("Nhap dia chi:");
        setDiaChi(nhap.nextLine());
        do{
        System.out.print("Nhap loai giao vien(nhap 1 hoac 2)\n1:Giang vien co huu\n2:giang vien thinh giang\n nhap:");
        setLoaiGiangVien(nhap.nextLine());
        }while(!"1".equals(getLoaiGiangVien()) && !"2".equals(getLoaiGiangVien()));
        System.out.println("da nhap xong!");
    }
    public abstract void nhapluong();
    public abstract void tinhLuong();
    public void inThongTin(){
        System.out.println("THONG TIN GIANG VIEN");
        System.out.println("*Ho ten:"+getHoTen());
        System.out.println("*Dia chi:"+getDiaChi());
        if("1".equals(getLoaiGiangVien())){
        System.out.println("*Loai Giang Vien: Co huu");  
        }
        else if("2".equals(getLoaiGiangVien())){
            System.out.println("*Loai Giang Vien: Thinh giang");
        }
    }
}
