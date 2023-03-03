import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a;
        Scanner nhapso = new Scanner(System.in);
        System.out.println("Nhap số a: ");
        a = nhapso.nextInt();
        if ( a % 2 == 0 ){
            System.out.println( "Số " +a+ " là chẵn" );
        } else {
            System.out.println("Số " +a+ " là lẻ" );
        }



    }
}
