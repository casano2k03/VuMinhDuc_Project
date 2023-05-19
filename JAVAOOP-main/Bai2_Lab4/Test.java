
package Bai2_Lab4;

public class Test {
    public static void main(String[] args) {
        Truong tg=new Truong("THPT Bach Nghe","Ha Noi","ABB");
        SinhVien sv=new SinhVien("Bach Cong Tu",17,'n',"A9","cntt",tg);
        System.out.println(sv.toString());
    }
            
}
