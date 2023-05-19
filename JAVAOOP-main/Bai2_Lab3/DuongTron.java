
package Java_OOP;

import java.util.Scanner;

public class DuongTron extends DIEM{
	private int r;

	public DuongTron(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}	
	public void NhapDT() {
		Scanner dt = new Scanner(System.in);
		System.out.print("Nhap toa do diem O(X,Y) : ");
		setX(dt.nextInt());
		setY(dt.nextInt());	
		System.out.print("Nhap ban kinh R : ");
		setR(dt.nextInt());
	}	
	public void InDT() {
		System.out.println("Tam cua duong tron la : "+"("+getX()+","+getY()+")");
		System.out.println("Ban kinh cua duong tron la : "+r);
	}
	public void ChuViDT() {
		double cvdt = (2*r)*Math.PI;
		System.out.println("Chu vi cua duong tron la : "+cvdt);
	}	
	public void DienTichDT() {
		double dtdt = r*r*Math.PI;
		System.out.println("Dien tich cua hinh tron la : "+dtdt);
	}
}