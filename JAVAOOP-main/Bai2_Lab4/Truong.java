
package Bai2_Lab4;

public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }
    public Truong(String ten,String diaChi,String hieuTruong){
        this.diaChi=diaChi;
        this.hieuTruong=hieuTruong;
        this.ten=ten;
    }
    @Override
    public String toString(){
        return "ten:"+ten+"\t dia chi: "+diaChi+"\t hieu truong: "+hieuTruong;
    }
            
}
