
package lab_5;
import java.util.*;
public class Bai4_lab5 {
    public static void main(String[] args) {
        int n;
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap so luong so thuc: ");
        n=nhap.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so: ");
            a[i]=nhap.nextInt();
        }
     
        /* ----dung Set----*/
        Set<Integer> A=new HashSet<>();
        Set<Integer> C=new HashSet<>();      
        for (int num :a){
            if(A.contains(num)){
                C.add(num);
            }
            else{
                A.add(num);
            }
        }
        System.out.println("Set-Cac phan tu xuat hien 1 lan trong mang");
        for(int num :A){
            if(!C.contains(num)){
                System.out.println(num);
            }
        }
  
        /*----dung Map---*/
        Map<Integer,Integer> B=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            addElement(B,a[i]);
        }
        System.out.print("Map-Cac phan tu chi xuat hien 1 lan trong mang: \n");
        for(Integer key:B.keySet()){
            if(B.get(key)==1){
                System.out.println(key);
            }
        }
        
    }
    public static void addElement(Map<Integer,Integer> B,int element){
    if(B.containsKey(element)){
        int so=B.get(element)+1;
        B.put(element, so);
    }else{
        B.put(element, 1);
    }
}
    
}
