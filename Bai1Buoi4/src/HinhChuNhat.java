import java.util.Scanner;
public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

public void Input(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nNhap chieu dai: ");
    chieuDai = scanner.nextInt();
    System.out.print("Nhap chieu rong: ");
    chieuRong = scanner.nextInt();
}

public void Output(){
    int chuVi = chieuDai+chieuRong;
    int dienTich=chieuDai*chieuRong;
    System.out.printf("%-20d%-20d%-20d%-20d\n" , chieuDai, chieuRong, chuVi, dienTich);

}

public double dienTich(){
    return chieuDai*chieuRong;
}
    public HinhChuNhat(){

    }
    public HinhChuNhat(int chieuDai, int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Integer getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(int chieuDais){
        chieuDai = chieuDais;
    }

    public Integer getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(int chieuRongs){
    chieuRong = chieuRongs;
    }


public static void main(String[] args) {

    HinhChuNhat HinhChuNhata = new HinhChuNhat();
    HinhChuNhat HinhChuNhatb = new HinhChuNhat();

  HinhChuNhata.setChieuDai(20);
  HinhChuNhata.setChieuRong(8);
  HinhChuNhatb.setChieuDai(17);
  HinhChuNhatb.setChieuRong(5);
  System.out.printf("%-20s%-20s%-20s%-20s\n","Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
  HinhChuNhata.Output();
  HinhChuNhatb.Output();

    HinhChuNhata.Input();
    HinhChuNhatb.Input();
    System.out.printf("%-20s%-20s%-20s%-20s\n","Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
    HinhChuNhata.Output();
    HinhChuNhatb.Output();

    if(HinhChuNhata.dienTich() > HinhChuNhatb.dienTich()){
        System.out.println("hinh chu nhat co dien tich lon nhat la: " +HinhChuNhata.dienTich());
    }else{
        System.out.println("hinh chu nhat co dien tich lon nhat la: " +HinhChuNhatb.dienTich());
    }

    }

}
