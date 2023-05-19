
package Bai6_Lab4;

import java.util.Scanner;
public class CNKSP extends CongNhan {
    private int soSanPham;
    private double donGiaSanPham;
    public CNKSP(String HoTen,String ngaySinh,String diaChi,String loaiCongNhan,int soSanPham,double donGiaSanPham){
        super(HoTen,ngaySinh,diaChi,loaiCongNhan);
        this.donGiaSanPham=donGiaSanPham;
        this.soSanPham=soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public void setDonGiaSanPham(double donGiaSanPham) {
        this.donGiaSanPham = donGiaSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public double getDonGiaSanPham() {
        return donGiaSanPham;
    }
    @Override
    public void nhapLuong(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap so san pham lam trong 1 thang:");
        setSoSanPham(nhap.nextInt());
        System.out.print("Nhap don gia cho san pham: ");
        setDonGiaSanPham(nhap.nextDouble());
    }
    @Override
    public void tinhLuong(){
        double thuong, luongThang;
        if(getSoSanPham()>=100){
            thuong=1000000;
        }
        else if(getSoSanPham()>=150){
            thuong=1500000;
        }else{
            thuong=0;
        }
        luongThang=getSoSanPham()*getDonGiaSanPham()+thuong;
        System.out.println("Luong thang:"+luongThang+"vnd");
    }
    
}
