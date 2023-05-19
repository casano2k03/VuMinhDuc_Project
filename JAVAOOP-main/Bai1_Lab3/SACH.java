
package Java_OOP;
import java.util.Scanner;
public class SACH {
    private String ma,ten,tg,loai,nxb;
    private int trang,tap,gia;
    public void NHAPSACH(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap ma sach: ");ma=nhap.nextLine();
        System.out.print("nhap ten sach: ");ten=nhap.nextLine();
        System.out.print("nhap ten tac gia: ");tg=nhap.nextLine();
        System.out.print("nhap loai sach: ");loai=nhap.nextLine();
        System.out.print("nhap nha xuat ban sach: ");   nxb=nhap.nextLine();
        System.out.print("nhap so trang sach: ");  trang=nhap.nextInt();
        System.out.print("nhap tap sach: ");        tap=nhap.nextInt();     
        System.out.print("nhap gia sach: ");        gia=nhap.nextInt();
    }
    public String INSACH(){
        return "ten sach: "+ten+"\t ma sach: "+ma+"\t ten tac gia: "+tg+"\t loai sach: "+loai+"\t nha xuat ban: "+nxb+"\t so trang: "+trang+"\t so tap: "+tap+"\t gia sach: "+gia;   
    } 
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);        
        System.out.println("nhap so luong sach: ");
        int n=a.nextInt();
        SACH A[]=new SACH[n];
        for(int i=0;i<n;i++){
            A[i]=new SACH();
            A[i].NHAPSACH();
        }
        for(int i=0;i<n;i++){
            System.out.println(A[i].INSACH());
        }
    }
    
}
