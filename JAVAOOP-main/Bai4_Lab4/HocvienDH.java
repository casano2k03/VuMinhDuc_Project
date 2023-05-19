
package Bai4_Lab4;

import java.util.Scanner;
public class HocvienDH extends Hocvien {
    int soBuoi;
    float donGiaDH;
    public HocvienDH(String hoten,String diachi,int loaiUuTien,String chuongTrinhDangKi,double Hocphi,int soBuoi,float donGiaDH){
        super(hoten,diachi,loaiUuTien,chuongTrinhDangKi,Hocphi);
        this.soBuoi=soBuoi;
        this.donGiaDH=donGiaDH;         
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public void setDonGiaDH(float donGiaDH) {
        this.donGiaDH = donGiaDH;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public float getDonGiaDH() {
        return donGiaDH;
    }
    public void nhaphp(){
        int a;
        Scanner nhap=new Scanner(System.in);
        System.out.println("nhap so buoi hoc: ");
        setSoBuoi(nhap.nextInt());
        System.out.println("nhap don gia: ");
        setDonGiaDH(nhap.nextFloat());
        do{
        System.out.print("Nhap loai uu tien:\n uu tien loai 1(tru 1.000.000vnd)\n uu tien loai 2(tru 500.000)\n nhap:");
        setLoaiUuTien(nhap.nextInt()); 
        a=getLoaiUuTien();
        }while(a!=1 && a!=2); 
    }
    @Override
    public void hocPhi(){
            if(getLoaiUuTien()==1){
                setHocphi(getSoBuoi()*getDonGiaDH()-1000000);
            }
            else if(getLoaiUuTien()==2){
                setHocphi(getSoBuoi()*getDonGiaDH()-500000);
            }
            System.out.println("*Hoc phi: "+getHocphi());
    }
    }   

