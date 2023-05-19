
package Java_OOP;
import java.util.Scanner;
public class DIEM {
    private int x, y;
	public DIEM(int x, int y) {
	this.x=x;
	this.y=y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void NHAPDIEM(){
        Scanner nhap=new Scanner(System.in);
            System.out.println("Nhap thong tin toa do diem x ");
            setX(nhap.nextInt());
            System.out.println("Nhap thong tin toa do diem y ");
            setY(nhap.nextInt());
	}
	
	public void inDiem() {
		System.out.print("("+x+", "+y+")");
	}	
}



