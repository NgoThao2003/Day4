import java.util.Scanner;
public class NhanVien {
    private static int temp=1;
    private int maNV;
    private String name;
    private int age;
    private String address;
    private String boPhan;

    public NhanVien(){
        maNV=temp++;
    }
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();
        System.out.print("Nhap bo phan lam viec: ");
        boPhan = scanner.nextLine();
    }

    public void output(){
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n",maNV,name, age, address, boPhan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
        NhanVien nv5 = new NhanVien();

        nv1.Input();
        nv2.Input();
        nv3.Input();
        nv4.Input();
        nv5.Input();

        System.out.println("\t\t\tTHONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Manv","Tennv","Tuoi","DiaChi","BoPhan");
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
        nv5.output();

    }
}
