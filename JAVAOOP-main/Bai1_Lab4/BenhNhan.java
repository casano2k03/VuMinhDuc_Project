
package Bai1_Lab4;


public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
    public BenhNhan(String tienSu,String chanDoan, BenhVien benhVien,String ten, int tuoi,char gioiTinh){
        super(ten,tuoi,gioiTinh);
        this.tienSu=tienSu;
        this.chanDoan=chanDoan;
        this.benhVien=benhVien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    
    @Override
    public String toString(){
        return "ten"+getTen()+"\ttuoi: "+getTuoi()+"\tgioi tinh"+getGioiTinh()+"\ttieu su:"+tienSu+"\t chuan doan: "+chanDoan+"\n benh vien "+benhVien;
    }
    
}
