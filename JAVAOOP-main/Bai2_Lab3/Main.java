
package Java_OOP;

public class Main {
    public static void main(String[] args) {
		TamGiac tg = new TamGiac(0, 0);
		tg.NHAPTG();
		tg.inTamGiac();		
		tg.Ktra();
		System.out.println(tg.ChuVi());
		System.out.println(tg.DienTich());
		
		DuongTron dt = new DuongTron(0,0,0);
		dt.NhapDT();
		dt.InDT();
		dt.ChuViDT();
		dt.DienTichDT();
    }
}
