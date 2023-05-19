
package Bai1_Lab4;
public class Nguoi {
     private String ten;
     private int tuoi;
     private char gioiTinh;   
     public Nguoi(String ten,int tuoi,char gioiTinh){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

     @Override
    public String toString(){
        return "ten:" +ten+ "\t tuoi: "+tuoi+"\t gioi tinh: "+gioiTinh;
    }
   
}
