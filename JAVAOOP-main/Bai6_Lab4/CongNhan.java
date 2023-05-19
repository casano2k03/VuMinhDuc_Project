
package Bai6_Lab4;

import java.util.Scanner;
public abstract class CongNhan {
    private String HoTen;
    private String ngaySinh;
    private String diaChi;
    private String loaiCongNhan;
    public CongNhan(String HoTen,String ngaySinh,String diaChi,String loaiCongNhan){
        this.HoTen=HoTen;
        this.diaChi=diaChi;
        this.loaiCongNhan=loaiCongNhan;
        this.ngaySinh=ngaySinh;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiCongNhan(String loaiCongNhan) {
        this.loaiCongNhan = loaiCongNhan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiCongNhan() {
        return loaiCongNhan;
    }
    
    public void nhapThongTin(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        setHoTen(nhap.nextLine());
        System.out.print("Nhap ngay sinh:");
        setNgaySinh(nhap.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiaChi(nhap.nextLine());
        do{
        System.out.print("Nhap loai cong nhan \n 1:Cong nhan khoan san pham \n 2:Cong nhan tinh cong nhan \n nhap:");
        setLoaiCongNhan(nhap.nextLine()); 
        }while(!"1".equals(getLoaiCongNhan()) && !"2".equals(getLoaiCongNhan()));
    }
    public abstract void tinhLuong();
    public abstract void nhapLuong();
    public void inThongTin(){
        System.out.println("*Ho ten:"+getHoTen());
        System.out.println("*Dia chi:"+getDiaChi());
        System.out.println("*Ngay sinh: "+getNgaySinh());
        if("1".equals(getLoaiCongNhan())){
            System.out.println("Loai cong nhan:CNKSP");
        }else{
            System.out.println("Loai cong nhan:CNTCN");
        }      
    }
}
