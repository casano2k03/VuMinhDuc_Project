
package Bai5_Lab4;
import java.util.Scanner;

public class GVCoHuu extends GiangVien{
    private double luongCoBan;
    private int heSoLuong;
    double namCongTac,phuCap;
    public GVCoHuu(String hoTen,String diaChi,String loaiGiangVien,double luongThang,double luongCoBan,int heSoLuong){
        super(hoTen,diaChi,loaiGiangVien,luongThang);
        this.heSoLuong=heSoLuong;
        this.luongCoBan=luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }    
    public double getLuongCoBan() {
        return luongCoBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;}

    public void nhapluong(){       
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        setLuongCoBan(nhap.nextDouble());
        System.out.println("Nhap he so luong: ");
        setHeSoLuong(nhap.nextInt());
        System.out.println("Nhap so nam cong tac");
        namCongTac=nhap.nextDouble();
    }    
    @Override
    public void tinhLuong(){        
        if(namCongTac<5){
            phuCap=getLuongCoBan()*0.05;
        }
        else{
            phuCap=getLuongCoBan()*(namCongTac/100);
    }       
        setLuongThang(getLuongCoBan()*getHeSoLuong()+phuCap);
        System.out.println("*Luong thang:"+getLuongThang()+"vnd");
    }
    
}
