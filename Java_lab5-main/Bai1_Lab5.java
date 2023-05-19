
package lab_5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
public class Bai1_Lab5 {

    public static void main(String[] args) {
        String n;
        int m=0;
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap so tu nhien n: ");
        n=nhap.nextLine();
        ArrayList<Character> A=new ArrayList<>();
        for(int i=0;i<n.length();i++){
            A.add(n.charAt(i));
        }
        System.out.println(A);
        for(int i=0;i<A.size();i++){
            if(Objects.equals(A.get(i), A.get(A.size()-i-1))){           
            }else{
                m++;
            }
        }
        if(m==0){
            System.out.println("n la so thuan nghich");
        }
        else{
            System.out.println("n khong la so thuan nghich");
        }
        }
    }
    
