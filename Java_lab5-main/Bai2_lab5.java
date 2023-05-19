
package lab_5;
import java.util.Stack;
import java.util.Scanner;
public class Bai2_lab5 {
    public static void main(String[] args) {
        int n,m;
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap so luong n so nguyen: ");
        n=nhap.nextInt();
        Stack<Integer> A=new Stack<>();
        for(int i=0;i<n;i++){
            System.out.print("nhap so thu "+(i+1)+": ");
            A.push(nhap.nextInt());
        }
        System.out.println("Stack A: "+A);
        System.out.print("So luong phan tu muon in ra(m<n)-in theo quy tac LIFO: ");
        do{
        m=nhap.nextInt();
        if(m>n){System.out.println("Nhap lai m: ");}
        }while(m>n);
        for (int i = 0; i < m; i++) {
            System.out.println(A.pop());
            
        }
    }
    
    
}
