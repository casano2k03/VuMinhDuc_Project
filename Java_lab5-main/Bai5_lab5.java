
package lab_5;

import java.util.*;
public class Bai5_lab5 {
    public static void main(String[] args) {
        int n;
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap so luong muon nhap: ");
        n=nhap.nextInt();
        double m[]=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu "+(i+1)+": ");
            m[i]=nhap.nextDouble();            
        }
        Set<Double> A=new TreeSet<>();
        Set<Double> B=new TreeSet<>();
        TreeSet<Double> C=new TreeSet<>();
        for(double num : m){
            if(A.contains(num)){
                B.add(num);
            }
            else{
                A.add(num);
            }
        }
        for(double num : A){
            if(!B.contains(num)){
                C.add(num);
            }
        }
        System.out.println("Set:"+A);
        Iterator<Double> D=C.descendingIterator();
        System.out.println("In ra nhung phan tu chi xuat hien 1 lan trong mang va theo thu tu giam dan:");
        while(D.hasNext()){
            System.out.println(D.next());
        }
    }
}
