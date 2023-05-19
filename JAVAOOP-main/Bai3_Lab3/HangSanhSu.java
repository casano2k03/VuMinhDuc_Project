
package Bai3_Lab3;

import java.util.Scanner;
public class HangSanhSu extends HangHoa {
    private static final String Null = null;
    private String loaiNguyenLieu;
    public HangSanhSu(String maHang,String tenHang,String nhaSanXuat,int gia,String loaiNguyenLieu){
        super(maHang,tenHang,nhaSanXuat,gia);
        this.loaiNguyenLieu=loaiNguyenLieu;
    }
    HangHoa hh=new HangHoa(Null,Null,Null,0);
    public void nhap(){ 
        hh.nhap();
        Scanner nhap = new Scanner(System.in); 
        System.out.print("nhap loai nguyen lieu: "); 
        loaiNguyenLieu=nhap.nextLine();
           
        }
    
    @Override
    public String toString(){
        hh.toString();
        return "loai nguyen lieu: "+loaiNguyenLieu;
    }
    
}
