
package Bai3_Lab3;

import java.util.Scanner;
public class HangDienMay extends HangHoa{
    private static final String Null = null;
	private int thoiGianBaoHanh;
    private float dienAp;
    private float congSuat;
	
    
	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, int gia, int thoiGianBaoHanh, float dienAp,
			float congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	
    HangHoa hh = new HangHoa(Null, Null, Null, 0);
	public void nhap() {
		hh.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Thoi gian bao hanh la : ");
		thoiGianBaoHanh=sc.nextInt();
		System.out.println("Dien ap la : ");
		dienAp=sc.nextFloat();
		System.out.println("Cong Suat la : ");
		congSuat=sc.nextFloat();
		
	}

	@Override
	public String toString() {
		hh.toString();
		return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", dienAp=" + dienAp + ", congSuat=" + congSuat
				+ ", hh=" + hh + "]";
	}

	
	
	
}
