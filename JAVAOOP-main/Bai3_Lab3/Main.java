
package Bai3_Lab3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){        	
        ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
    	int luaChon =0;
	Scanner nhap = new Scanner(System.in);
	do {
	System.out.println("Nhap tuy chon : ");
	System.out.println("""
                           1.Nhap hang dien may 
                           2.Nhap hang sanh su 
                           3.Nhap hang thuc pham
                           4.in ra 
                           5.Thoat  
                           """);
	System.out.println("Nhap Lua Chon Cua Ban 	: ");
	luaChon = nhap.nextInt();
	switch (luaChon) {
            case 1: {
                HangDienMay dm = new HangDienMay(null, null, null, 0, 0, 0, 0);
                dm.nhap();
                dsHH.add(dm);
                break;
            }
            case 2: {
		HangSanhSu ss = new HangSanhSu(null, null, null, 0, null);
		ss.nhap();
		dsHH.add(ss);
		break;
	}
            case 3: {
		HangThucPham tp = new HangThucPham(null, null, null, 0, null, null,null);
		tp.nhap();
		dsHH.add(tp);
		break;
            }
            case 4: {
		if(dsHH.size() == 0) {
                    System.out.println("Danh Sach Rong!!!");
				}
                else {
		for (int i=0;i<dsHH.size();i++) {
			System.out.println(dsHH.get(i));
			System.out.println();
		}
	}}
	default:
		System.out.println("Nhap sai lua chon (1->4) : ");
		break;
		}
		}while(luaChon !=5);
	}

}

