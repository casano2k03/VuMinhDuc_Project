
package Bai2_Lab4;
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;
    public SinhVien(String ten,int tuoi,char gioiTinh,String lop,String nganh,Truong truong){
        super(ten,tuoi,gioiTinh);
        this.lop=lop;
        this.nganh=nganh;
        this.truong=truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }
    @Override
    public String toString(){
        return "ten: "+getTen()+"\t tuoi: "+getTuoi()+"\t gioi tinh:"+getGioiTinh()+"\nlop: "+lop+"\t nganh: "+nganh+"\n truong: "+truong;
    }
}
