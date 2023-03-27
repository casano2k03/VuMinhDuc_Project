
public class bai6 {
    public static void main(String[] args) {
        int so,giaithua=1;
        try(Scanner nhap=new Scanner(System.in)){
            do{
                System.out.print("nhap so: ");
                so=nhap.nextInt();
            }while(0>so || so-(int)so!=0);
            for(int i=1;i<=so;i++)
            {giaithua *=i;
            }
            System.out.println("giai thua cua so do la "+giaithua);
            nhap.close();
        }
    }
}