
package Bai4_Lab4;


public class Main {
    public static void main(String[] args) {
        Hocvien Hva=new HocvienDH(null,null,0,null,0,0,0);
        Hocvien Hvb=new HocvienLT(null,null,0,null,0,0,0);
        Hva.nhapThongTin();
        if("Do hoa".equals(Hva.getChuongTrinhDangKi())){
            Hva.nhaphp();
            Hva.inThongTin(); 
            Hva.hocPhi();
        }
        else if("Lap trinh".equals(Hva.getChuongTrinhDangKi())){
            Hvb.nhaphp();
            Hva.inThongTin();
            Hvb.hocPhi();}
        Hvb.nhapThongTin();
        if("Do hoa".equals(Hvb.getChuongTrinhDangKi())){
            Hvb.nhaphp();
            Hvb.inThongTin();
            Hvb.hocPhi();
        }
        else if("Lap trinh".equals(Hvb.getChuongTrinhDangKi())){
            Hva.nhaphp();
            Hvb.inThongTin();
            Hva.hocPhi();
        }
    }
}
