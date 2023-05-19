
package Bai3_Lab3;

import java.util.Scanner;
public class HangHoa {
    private String maHang;
    private String tenHang;
    private String nhaSanXuat;
    private int gia;
    public HangHoa(String maHang,String tenHang,String nhaSanXuat,int gia){
       this.maHang=maHang; 
       this.tenHang=tenHang; this.gia=gia; 
       this.nhaSanXuat=nhaSanXuat;
       this.gia=gia; 
    }
    public void nhap()
    {
        Scanner nhap = new Scanner(System.in); 
            System.out.print("nhap ma hang: "); maHang=nhap.nextLine();
            System.out.print("nhap ten hang: "); tenHang=nhap.nextLine();
            System.out.print("nhap nha san xuat: "); nhaSanXuat=nhap.nextLine();
            System.out.print("nhap gia san pham: "); gia=nhap.nextInt();
        
    }
    @Override
    public String toString(){
        return "ma hang: "+maHang+"\t ten hang: "+tenHang+"\t nha san xuat: "+nhaSanXuat+"\t gia san pham: "+gia+"vnd";
    }
}
