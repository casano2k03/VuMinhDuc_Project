
package Bai5_Lab4;
import java.util.Scanner;
public class GVThinhGiang extends GiangVien{
    private int soTietDay;
    private double donGia;
    private double thuNhap;
    public GVThinhGiang(String hoTen,String diaChi,String loaiGiangVien,double luongThang,int soTietDay,double donGia,double thuNhap){
        super(hoTen,diaChi,loaiGiangVien,luongThang);
        this.donGia=donGia;
        this.soTietDay=soTietDay;
        this.thuNhap=thuNhap;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getThuNhap() {
        return thuNhap;
    }
    public void nhapluong(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap so tiet day:");
        setSoTietDay(nhap.nextInt());
        System.out.println("Nhap don gia:");
        setDonGia(nhap.nextDouble());
    }
    @Override
    public void tinhLuong(){
        setThuNhap(0.15*getSoTietDay()*getDonGia());
        setLuongThang(getSoTietDay()*getDonGia()-getThuNhap());
        System.out.println("*Luong thang: "+getLuongThang()+"vnd");
    }
}
