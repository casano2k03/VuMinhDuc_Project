
package Bai1_Lab4;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;    
    public BenhVien(String ten,String diaChi,String giamDoc){
        this.ten=ten;
        this.diaChi=diaChi;
        this.giamDoc=giamDoc;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    @Override
    public String toString(){
        return "ten: "+ten+"\t dia chi:"+diaChi+"\t giam doc: "+giamDoc;
    }
}
