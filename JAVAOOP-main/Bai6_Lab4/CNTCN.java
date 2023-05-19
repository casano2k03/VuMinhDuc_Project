
package Bai6_Lab4;

import java.util.Scanner;
public class CNTCN extends CongNhan {
    private double luongCoBan;
    private int heSoLuong;
    private int soNgayCong;
    public CNTCN(String HoTen,String ngaySinh,String diaChi,String loaiCongNhan,double luongCoBan,int heSoLuong,int soNgayCong){
        super(HoTen,ngaySinh,diaChi,loaiCongNhan); 
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;  
        this.soNgayCong=soNgayCong;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }
    
    @Override
    public void nhapLuong(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap luong thang co ban: ");
        setLuongCoBan(nhap.nextDouble());
        System.out.print("Nhap he so luong: ");
        setHeSoLuong(nhap.nextInt());
        System.out.print("Nhap so ngay cong: ");
        setSoNgayCong(nhap.nextInt());
    }
    @Override
    public void tinhLuong(){
        double thuong,luongThang;
        if(getSoNgayCong()>=20){
        thuong=1.2*getLuongCoBan();
    }
        else{
        thuong=0.0;
    }
        luongThang=getLuongCoBan()*getHeSoLuong()+thuong;
        System.out.println("Luong thang: "+luongThang+" vnd");
    }
}
