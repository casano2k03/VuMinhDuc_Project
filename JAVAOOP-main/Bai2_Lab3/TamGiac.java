
package Java_OOP;
import java.util.Scanner;
import java.lang.Math;

public class TamGiac extends DIEM{
	public TamGiac(int x, int y) {
		super(x, y);
	}	
    DIEM A = new DIEM(0, 0);
    DIEM B = new DIEM(0, 0);
    DIEM C = new DIEM(0, 0);	
	double AB, AC, BC;
        int i=0;
	public void NHAPTG() {
		
		System.out.println("Nhap toa do diem A ");
		A.NHAPDIEM();
		System.out.println("Nhap toa do diem B ");
		B.NHAPDIEM();
		System.out.println("Nhap toa do diem C ");
		C.NHAPDIEM();
	}
	
	public void inTamGiac() {
		System.out.print("Toa do diem A la : ");
		A.inDiem();
		System.out.println();
		System.out.print("Toa do diem B la : ");
		B.inDiem();
		System.out.println();
		System.out.print("Toa do diem C la : ");
		C.inDiem();
	}   
	public void Ktra() {		
            AB = (Math.sqrt((Math.pow((B.getX()-A.getX()), 2)) + (Math.pow((B.getY()-A.getY()), 2))));
	    BC = (Math.sqrt((Math.pow((C.getX()-B.getX()), 2)) + (Math.pow((C.getY()-B.getY()), 2))));
	    AC = (Math.sqrt((Math.pow((C.getX()-A.getX()), 2)) + (Math.pow((C.getY()-A.getY()), 2))));	    	    
            if(AB+BC<AC && BC+AC<AB && AC+AB<BC)
        {
            System.out.println("\n A B C khong la 3 dinh cua tam giac\n");
        }
        else{
            System.out.println("\n A B C la 3 dinh cua ABC\n");
            i++;}  }
	
	
 public String ChuVi(){
     if(i!=0){
        return "Chu vi tam giac ABC= AB+BC+CA= "+ (AB+BC+AC);}
     return "khong co ket qua";
    }

 public String DienTich(){
        double p=(AB+AC+BC)/2;
        if(i!=0){
        return "Dien tich tam giac ABC="+(Math.sqrt(p*(p-AB)*(p-BC)*(p-AC)));}
        return " khong co ket qua";
}}
