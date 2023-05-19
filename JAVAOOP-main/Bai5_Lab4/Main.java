
package Bai5_Lab4;

public class Main {
    public static void main(String[] args) {
        GiangVien gv1=new GVCoHuu(null,null,null,0,0,0);
        GiangVien gv2=new GVThinhGiang(null,null,null,0,0,0,0);
        gv1.nhapThongTin();
        if("1".equals(gv1.getLoaiGiangVien())){
            gv1.nhapluong();
            gv1.inThongTin();
            gv1.tinhLuong();
        }
        else if("2".equals(gv1.getLoaiGiangVien())){
            gv2.nhapluong();
            gv1.inThongTin();
            gv2.tinhLuong();
            
        }
        gv2.nhapThongTin();
        if("1".equals(gv2.getLoaiGiangVien())){
            gv1.nhapluong();
            gv2.inThongTin();
            gv1.tinhLuong();
           
        }
        else if("2".equals(gv2.getLoaiGiangVien())){
            gv2.nhapluong();
            gv2.inThongTin();
            gv2.tinhLuong();
        }
    }
}
