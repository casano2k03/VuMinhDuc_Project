
package Bai6_Lab5;

import java.util.*;
public class SinhVien {
    String HoVaTen,MSSV,Lop;
    public SinhVien(String HoVaTen,String MSSV,String Lop){
        this.HoVaTen=HoVaTen;
        this.MSSV=MSSV;
        this.Lop=Lop;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong sinh vien:");
        do{
        n=nhap.nextInt();}while(n==0);
        System.out.println("---------------------");
        Map<Integer,SinhVien> A=new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("sinh vien thu "+(i+1)+"(ten,MSSV,lop): ");
            if(i==0){
            nhap.nextLine();}
            A.put(i,new SinhVien(nhap.nextLine(),nhap.nextLine(),nhap.nextLine()));
        }
        System.out.println("Bang SinhVien:");
        for(Map.Entry<Integer, SinhVien> D:A.entrySet()){
            System.out.println("ho ten:"+D.getValue().HoVaTen+"\t MSSV: "+D.getValue().MSSV+"\t Lop:"+D.getValue().Lop);
        }
        String LopIn,MSVIn;
        System.out.print("Nhap Lop muon in ra:");
        LopIn=nhap.nextLine();
        for(Map.Entry<Integer, SinhVien> B:A.entrySet()){
            if(B.getValue().Lop.equals(LopIn)){
                System.out.println("ho va ten: "+B.getValue().HoVaTen+"\t MSSV: "+B.getValue().MSSV);
            }
    }
        System.out.print("Nhap MSSV muon in ra:");
        MSVIn=nhap.nextLine();
        for(Map.Entry<Integer,SinhVien> C:A.entrySet()){
            if(C.getValue().MSSV.equals(MSVIn)){
                System.out.println("ho va ten: "+C.getValue().HoVaTen+"\t Lop: "+C.getValue().Lop);
            }
        }
    }
}
