
package Bai6_Lab4;

public class Main {
    public static void main(String[] args) {
        CongNhan cn1=new CNKSP(null,null,null,null,0,0);
        CongNhan cn2=new CNTCN(null,null,null,null,0,0,0);
        cn1.nhapThongTin();
        if("1".equals(cn1.getLoaiCongNhan())){
            cn1.nhapLuong();
            cn1.inThongTin();
            cn1.tinhLuong();
        }
        else{
            cn2.nhapLuong();
            cn1.inThongTin();
            cn2.tinhLuong();
        }
        cn2.nhapThongTin();
        if("2".equals(cn2.getLoaiCongNhan())){
            cn2.nhapLuong();
            cn2.inThongTin();
            cn2.tinhLuong();
        }
        else{
            cn1.nhapLuong();
            cn2.inThongTin();
            cn1.tinhLuong();
        }
    }
    
}
