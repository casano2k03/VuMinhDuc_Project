
package lab_5;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;
public class Bai3_lab5 {
    public static void main(String[] args) {
        int n,m;
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen n: ");
        n=nhap.nextInt();
        Queue<Integer> A=new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu "+(i+1)+": ");
            A.offer(nhap.nextInt());
        }
        System.out.println("in ra Queue :"+A);
        System.out.print("Nhap so luong so muon in ra(m<n)-in theo quy tac FIFO: ");
        do{
            m=nhap.nextInt();
            if(m>n){
                System.out.println("Nhap lai :");
            }                   
        }while(m>n);
        for (int i = 0; i < m; i++) {
            System.out.println(A.poll());
        }
    }
}
