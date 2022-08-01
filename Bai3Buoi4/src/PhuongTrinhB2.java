import java.util.Scanner;
public class PhuongTrinhB2 {
    private double a;
    private double b;
    private double c;

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a= ");
        a = scanner.nextDouble();
        System.out.print("Nhap b= ");
        b = scanner.nextDouble();
        System.out.print("Nhap c= ");
        c = scanner.nextDouble();
    }

    public void Output(){

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }

    public void tinhNghiem(){
        double deta, x1,x2,x;
        deta = (b*b)-4*a*c;
        if(deta>0){
            System.out.println("\nPhuong trinh co 2 nghiem phan biet");
            x1=(-b+Math.sqrt(deta))/(2*a);
            x2=(-b-Math.sqrt(deta))/(2*a);
            System.out.print("x1= "+x1);
            System.out.print("\nx2= "+x2);
        }
        else if (deta==0){
            System.out.println("Phuong trinh co nghiem kep");
            x=-b/(2*a);
            System.out.println("Nghiem la: "+ x);
        }
        else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        PhuongTrinhB2 PtBac2a = new PhuongTrinhB2();
        PtBac2a.Input();
        PtBac2a.Output();
        PtBac2a.tinhNghiem();
    }
}
